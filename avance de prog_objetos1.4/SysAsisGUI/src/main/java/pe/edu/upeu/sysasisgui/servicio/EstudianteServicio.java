package pe.edu.upeu.sysasisgui.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasisgui.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServicio {

    public List<Estudiante> estudiantes=new ArrayList<>();

    //Create
    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    //Reporte
    public List<Estudiante> getEntidad() {
        return estudiantes;
    }

    public Estudiante getEntidad(int index) {
        return estudiantes.get(index);
    }

    //Update
    public void update(int index, Estudiante estudiante) {
        estudiantes.set(index, estudiante);
    }
    //Delete
    public void delete(int index) {
        estudiantes.remove(index);
    }

    public void deleteEntidad(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }


    public void cargarDatos() {
        estudiantes.add(new Estudiante("Ayme Figueroa Ronaldo"));
        estudiantes.add(new Estudiante("BERRIOS FLORES ABEL YEINS"));
        estudiantes.add(new Estudiante("BILBAO LIZARRAGA ANDRE FABRICIO"));
        estudiantes.add(new Estudiante("Cabana Cruz Edgar D Alessandro"));
        estudiantes.add(new Estudiante("CHAMBILLA CHAMBILLA HERMES ADAN"));
        estudiantes.add(new Estudiante("CHOQUE VELARDE JHOSEPMIR HENRY"));
    }
}
