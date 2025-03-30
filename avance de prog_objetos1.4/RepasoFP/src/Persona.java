public class Persona {
    public String nombre;
    public String estado;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
