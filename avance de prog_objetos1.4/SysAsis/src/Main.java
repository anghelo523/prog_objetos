import modelo.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    List<Persona> listaMatriculados= new ArrayList<>();
    Scanner sc=new Scanner(System.in);

    public void matriculados(){
        listaMatriculados.add(new Persona("43631917", "David Mamani"));
        listaMatriculados.add(new Persona("43631918", "Raul Perez"));
        listaMatriculados.add(new Persona("43631919", "Pedro Perez"));
        listaMatriculados.add(new Persona("43631920", "Pablo Perez"));
        listaMatriculados.add(new Persona("43631921", "Juan Perez"));
        listaMatriculados.add(new Persona("43631922", "Maria Perez"));
        listaMatriculados.add(new Persona("43631923", "Roel Perez"));
    }


    public void llamarAsistencia(){
        System.out.println("Registrar Asistencia (P=Presente, F=Falta):");
        int i=0;
        for(Persona p: listaMatriculados){
            System.out.println(p.nombre+":");
            p.estado=sc.next();
            listaMatriculados.set(i,p);
            i++;
        }
    }

    public void listarAsistencia(){
        System.out.println("Reporte Asistencia:");
        for (Persona p: listaMatriculados){
            System.out.println(p.dni+"\t"+p.nombre+"\t"+p.estado);
        }
    }


    public void justificarFaltas(){
        System.out.println("Justificar Faltas:");
        int i=0;
        for(Persona p: listaMatriculados){
            if(p.estado.toUpperCase().equals("F")){
                System.out.println(p.nombre+" Justificar (S/N)?");
                String est=sc.next();
                if(est.toUpperCase().charAt(0)=='S'){
                    p.estado="J";
                    listaMatriculados.set(i, p);
                }
            }
            i++;
        }
    }


    public static void main(String[] args) {
            Main m=new Main();
            m.matriculados();
            m.llamarAsistencia();
            m.listarAsistencia();
            m.justificarFaltas();
            m.listarAsistencia();
    }
}
