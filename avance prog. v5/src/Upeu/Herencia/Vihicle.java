package Upeu.Herencia;

public class Vihicle {
    private String marca;// clave de la targeta
    protected String tipo;

    public void sound(){
        System.out.println("tiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println("Mis caracteristicas son:\n Marca: " + marca + "\n Tipo: "+tipo  );
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
