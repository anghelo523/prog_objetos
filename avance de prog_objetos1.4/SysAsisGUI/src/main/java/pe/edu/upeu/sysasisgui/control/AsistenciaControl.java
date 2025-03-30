package pe.edu.upeu.sysasisgui.control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.sysasisgui.modelo.Asistencia;
import pe.edu.upeu.sysasisgui.modelo.Estudiante;
import pe.edu.upeu.sysasisgui.servicio.AsistenciaServicio;
import pe.edu.upeu.sysasisgui.servicio.EstudianteServicio;

@Controller
public class AsistenciaControl {

    @FXML
    private Button btnGuardar;

    @FXML
    private TableView<Estudiante> tableRegAsis;
    @FXML
    private TableView<Asistencia> tableListAsis;

    @Autowired
    private EstudianteServicio estudianteService;

    @Autowired
    private AsistenciaServicio asistenciaService;

    private ObservableList<Estudiante> estudiantes;
    private ObservableList<Asistencia> asistencias;

    @FXML
    private Label cantP, cantA, cantJ;

    @FXML
    private void initialize(){
        estudianteService.cargarDatos();
        listarEstudiantes();
        listarAsistenciaR();
        btnGuardar.setOnAction(e->{
            guardarAsistencia();
            listarAsistencias();
            generarResumen();
        });
    }

    public void listarAsistencias(){
        tableListAsis.getItems().clear();
        asistencias= FXCollections.observableArrayList(asistenciaService.getEntidad());
        tableListAsis.setItems(asistencias);
    }

    public void generarResumen(){
        int p=0, a=0, j=0;
        for(Asistencia asis: asistencias){
            if(asis.getEstado().equals("Presente")){p++;}
            else if(asis.getEstado().equals("Ausente")){a++;}
            else{
            j++;
            }
        }
        cantP.setText(String.valueOf(p));
        cantA.setText(String.valueOf(a));
        cantJ.setText(String.valueOf(j));
    }

    public void guardarAsistencia(){
        System.out.println("guadar asistencia");
        asistenciaService.asistencias.clear();
        for (Estudiante estudiante: estudiantes){
            asistenciaService.save(new Asistencia(estudiante.getNombre(),
                    estudiante.isEstado()?"Presente":"Ausente"));
        }
    }

    public void listarAsistenciaR(){
        TableColumn<Asistencia, String> nameColumn = new TableColumn<>("Nombre");
        nameColumn.setCellValueFactory(new PropertyValueFactory<Asistencia,String>("nombre"));

        TableColumn<Asistencia, String> estadoColumn = new TableColumn<>("Estado");
        estadoColumn.setCellValueFactory(new PropertyValueFactory<Asistencia,String>("estado"));


        asistencias= FXCollections.observableArrayList(asistenciaService.getEntidad());
        tableListAsis.getColumns().addAll(nameColumn, estadoColumn);
        tableListAsis.setItems(asistencias);

    }

    private void listarEstudiantes(){

        TableColumn<Estudiante, String> nameColumn = new TableColumn<>("Nombre");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());

        TableColumn<Estudiante, Boolean> asistenciaColumn = new TableColumn<>("Asistencia");
        asistenciaColumn.setCellValueFactory(cellData ->cellData.getValue().estadoProperty());

        asistenciaColumn.setCellFactory(tc -> new TableCell<>() {
            private final CheckBox checkBox = new CheckBox();
            {
                checkBox.setOnAction(e -> {
                    Estudiante estudiante =getTableView().getItems().get(getIndex());

                    estudiante.setEstado(checkBox.isSelected());
                });
            }
            @Override
            protected void updateItem(Boolean item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    checkBox.setSelected(item);
                    setGraphic(checkBox);
                }
            }
        });


        estudiantes = FXCollections.observableArrayList(estudianteService.getEntidad());
        tableRegAsis.getColumns().addAll(nameColumn, asistenciaColumn);
        tableRegAsis.setItems(estudiantes);
    }



}
