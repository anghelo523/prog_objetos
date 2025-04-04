package Upeu.obj;
import  java.util.*;

import Upeu.Modelo.Persona;

public class ClassGeneral {
    public static void main(String[] args) {
        Persona persona;//Variable del tipo Persona
        persona = new Persona();//persona es un
        System.out.println("ingrese su nombre");
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("HOsra sus edad");
        int edd = sc.nextInt();

        persona.setNombre(name);//emcapsulamiento
        persona.setEdad(edd); //emcapsulamiento
        persona.saludo();

    }
}
