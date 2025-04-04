package Upeu.Herencia;

public class Car extends Vihicle {
    protected   String modelo;

    public void mostrarInfo(){

        tipo="Electronico";
        setMarca("Toyota");
        modelo="HILUX";
    sound();
        System.out.println("Modelo: "+ modelo);
    }
    public static void main(String[] args) {
        new Car().mostrarInfo();
    }
}
