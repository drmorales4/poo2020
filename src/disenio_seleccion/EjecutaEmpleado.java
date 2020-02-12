package disenio_seleccion;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del Empleado");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas");
        int horas = entrada.nextInt();
        System.out.println("Ingrese el valor por cada hora trabajada");
        double cuota = entrada.nextDouble();

        Empleado empleado = new Empleado(nombre, horas, cuota);

        String presentaacion = empleado.presentar();
        System.out.println(presentaacion);


    }
}
