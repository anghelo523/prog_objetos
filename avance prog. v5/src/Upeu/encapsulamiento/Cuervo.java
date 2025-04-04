package Upeu.encapsulamiento;

public class Cuervo implements Animal{
    @Override
    public void comer() {
        System.out.println("cocooclcsss");
    }

    @Override
    public void dormir() {
        System.out.println("Dormir: zzzz.z.zz ");
    }

    @Override
    public void emitirSonido() {
        System.out.println("que haces jugndo");
    }

    @Override
    public String peso() {
        return "Estoy pesando 2 kilos";
    }
}
