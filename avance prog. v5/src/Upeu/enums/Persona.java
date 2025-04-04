package Upeu.enums;

enum GENERO{Masculino,Femenino};

public class Persona {

    enum ESTADO_CIVIL{Casado,Divorciado, Soltero, Viudo}
    String nombre;
    int edad;
    //tring sexo;
    //String estadoCivil;

    GENERO sexo= GENERO.Masculino;
    String estado_civil= String.valueOf(ESTADO_CIVIL.Soltero);

    public static void main(String[] args) {
        Persona p=new Persona();
        p.nombre="juan";
        p.edad=30;
        p.estado_civil=String.valueOf(ESTADO_CIVIL.Casado);

        System.out.println("Nombre: "+p.nombre+"\nEdad: " + p.edad+"\nEstado Civil: "+ p.estado_civil + "\nSexo: "+p.sexo);
        for (ESTADO_CIVIL e: ESTADO_CIVIL.values()){
            System.out.println(e);
        }
    }
}
