package Upeu.Herencia;

public class CalseGeneral extends Car {
    public void viewInfo(){
        tipo="COmbbustible";
        setMarca("toyota");
        modelo="HILUX";
        sound();
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {
        CalseGeneral car=new CalseGeneral();
        car.viewInfo();
    }
}
