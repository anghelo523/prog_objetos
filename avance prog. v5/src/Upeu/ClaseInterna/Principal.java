package Upeu.ClaseInterna;

public class Principal {
    public static void main(String[] args) {
        Madre madre=new Madre();
        madre.nombre="Birgida";
        madre.edad=30;
        madre.peso=70;
        madre.apellido="Apaza";

        Madre.Hijo hijo=madre.new Hijo();
        hijo.nombre="Raul";
        hijo.apelllido=madre.apellido;
        hijo.peso=4;
        System.out.println("Madre gestando");
        System.out.println("Nombre: " + madre.nombre+"\nApellido: "+ madre.apellido+"\npeso: " +madre.peso);
        System.out.println("Madre COn Hijo");
        System.out.println("Nombre: " + madre.nombre+"\nApellido: "+ madre.apellido+"\npeso: " +(madre.peso- hijo.peso));
        System.out.println("Dtos del Hijo");
        System.out.println("Nombre: " + hijo.nombre+"\nApellido: "+ hijo.apelllido+"\npeso: " + hijo.peso);
    }
}
