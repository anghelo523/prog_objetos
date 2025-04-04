package Upeu.encapsulamiento;

public class Loro implements Animal {
    @Override
    public void comer() {
        System.out.println("comiendod");
    }

    @Override
    public void dormir() {
        System.out.println("zzz.z..z.z.z");
    }

    @Override
    public void emitirSonido() {
        System.out.println("oye atiende a tu profesor");
    }

    @Override
    public String peso() {
        return "Estoy pesando 1kilo";
    }
}
