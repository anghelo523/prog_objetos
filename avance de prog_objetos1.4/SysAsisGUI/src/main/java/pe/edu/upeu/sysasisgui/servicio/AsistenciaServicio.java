package pe.edu.upeu.sysasisgui.servicio;

import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasisgui.modelo.Asistencia;
import pe.edu.upeu.sysasisgui.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

@Service
public class AsistenciaServicio {

    public List<Asistencia> asistencias=new ArrayList<>();

    //Create
    public void save(Asistencia dato) {
        asistencias.add(dato);
    }

    //Reporte
    public List<Asistencia> getEntidad() {
        return asistencias;
    }

    public Asistencia getEntidad(int index) {
        return asistencias.get(index);
    }

    //Update
    public void update(int index, Asistencia dato) {
        asistencias.set(index, dato);
    }
    //Delete
    public void delete(int index) {
        asistencias.remove(index);
    }

    public void deleteEntidad(Asistencia dato) {
        asistencias.remove(dato);
    }


}
