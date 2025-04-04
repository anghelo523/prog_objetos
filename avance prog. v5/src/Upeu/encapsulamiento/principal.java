package Upeu.encapsulamiento;

public class principal {
    public static void main(String[] args) {
        Animal a;
        a=new Loro();
        a.comer(); a.emitirSonido(); a.dormir(); a.peso();

        a=new Cuervo();
        a.comer(); a.emitirSonido(); a.dormir(); a.peso();
    }
}
