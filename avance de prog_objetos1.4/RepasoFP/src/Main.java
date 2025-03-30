import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Persona[] personas;
    Scanner sc = new Scanner(System.in);

    List<Persona> listaPersonas = new ArrayList<>();
   // ArrayList<Persona> alista= new ArrayList<>();


    public void registrarAsisTeciaList(){
        String existeP = "SI";
        while(existeP.equals("SI")){
            System.out.println("Ingrese el Nombre del Persona ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el Estado del Persona ");
            String estado = sc.nextLine();
            Persona persona = new Persona();
            persona.setNombre(nombre);
            persona.setEstado(estado);
            listaPersonas.add(persona);
            System.out.println("Existe mas estudiantes matriculados (SI/NO)");
            existeP = sc.nextLine().toUpperCase();
        }

        for(Persona persona : listaPersonas){
            System.out.println(persona.getNombre() + "\t" + persona.getEstado());
        }

        System.out.println("Ingrese el nombre del Persona :");
        String nombre = sc.nextLine();
        for(Persona persona : listaPersonas){
            if(persona.getNombre().equals(nombre)){
                persona.setEstado("J");
            }
            listaPersonas.set(listaPersonas.indexOf(persona), persona);
        }

        for(Persona persona : listaPersonas){
            System.out.println(persona.getNombre() + "\t" + persona.getEstado());
        }


    }
    public void registrarAsistencia() {
        System.out.println("Ingrese la cantidad de estudiantes matriculados");
        int cantidad = sc.nextInt();
        personas = new Persona[cantidad];
        for (int i = 0; i < personas.length; i++) {
            Persona personaX = new Persona();
            System.out.println("Ingrese el nombre del persona");
            personaX.nombre = sc.next();
            System.out.println("Ingrese el estado del persona (P=Presente, F=Falta)");
            personaX.estado = sc.next();
            personas[i] = personaX;
        }
        System.out.println("Reporte de asistencia:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].nombre + "\t" + personas[i].estado);
        }
    }


    public static void main(String[] args) {
        // new Main().registrarAsistencia();
        Main main = new Main();
        //main.registrarAsistencia();
        main.registrarAsisTeciaList();
    }
}