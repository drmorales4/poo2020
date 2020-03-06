package datos_tipo_objeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");
        boolean bandera = true;

        do {
            System.out.println("\nDigite 1 para almecenar nuevo Nombre a la lista");
            System.out.println("Digite 2 para presentar la lista");
            System.out.println("Digite 3 para salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    Estudiante est = new Estudiante();
                    System.out.println("Ingrese nombre: ");
                    est.setNombre(entrada.nextLine());
                    System.out.println("Ingrese cedula: ");
                    est.setCedula(entrada.nextLine());
                    System.out.println("Ingrese edad: ");
                    est.setEdad(entrada.nextInt());
                    entrada.nextLine();
                    System.out.println("Ingrese carrera: ");
                    est.setCarrera(entrada.nextLine());
                    System.out.println("Ingrese correo: ");
                    est.setCorreo(entrada.nextLine());

                    estudiantes.add(est);
                    break;

                case 2:
                    System.out.println("\nFICHAS DE ESTUDIANTES REGISTRADOS");
                    for (Estudiante e: estudiantes){
                        System.out.println("----------------------");
                        System.out.println("Nombre: "+e.getNombre());
                        System.out.println("Cedula: "+e.getCedula());
                        System.out.println("Edad: "+e.getEdad());
                        System.out.println("Carrera: "+e.getCarrera());
                        System.out.println("Correo: "+e.getCorreo());
                        System.out.println("----------------------");
                    }
                    break;

                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
        }while (bandera);
    }
}
