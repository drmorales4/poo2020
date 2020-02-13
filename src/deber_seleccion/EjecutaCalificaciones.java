package deber_seleccion;
import java.util.Scanner;
public class EjecutaCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Estudiante:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese Calificacion 1:");
        double calificacion1 = entrada.nextDouble();
        System.out.println("Ingrese Calificacion 2:");
        double calificacion2 = entrada.nextDouble();
        System.out.println("Ingrese Calificacion 3:");
        double calificacion3 = entrada.nextDouble();
        System.out.println("Ingrese Calificacion 4:");
        double calificacion4 = entrada.nextDouble();

        Calificaciones calificaciones = new Calificaciones(nombre, calificacion1, calificacion2, calificacion3, calificacion4);
        String presentacion = calificaciones.presentar();
        System.out.println(presentacion);

    }
}
