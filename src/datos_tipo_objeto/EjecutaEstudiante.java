package datos_tipo_objeto;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Estudiante [] estudiantes = new Estudiante[3];
        int contador;
        int opcion;
        Estudiante estudiante;
        boolean bandera = true;
        for (contador = 0; contador < estudiantes.length; contador++) {
            System.out.println("Ingreso nuevo estudiante");
            System.out.println("\nDijite 1 si desea ingresar datos");
            System.out.println("Dijite 2 para salir");
            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
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

                estudiantes[contador] = est;
                estudiante = est;

                System.out.println("VALORES DE ESTUDIANTE.");
                System.out.println(estudiante.getNombre());
                System.out.println(estudiante.getCedula());
                System.out.println(estudiante.getEdad());
                System.out.println(est.getCarrera());
                System.out.println((est.getCorreo()));
            }
        }
        System.out.println("LISTAS DEL ESTUFFIANTE");
        System.out.println("Cedula\nnombre");
        int edad_acum = 0;
        for (contador = 0; contador < estudiantes.length; contador++){
            System.out.println(estudiantes[contador].getCedula()+"\t"+estudiantes[contador].getNombre());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
}
