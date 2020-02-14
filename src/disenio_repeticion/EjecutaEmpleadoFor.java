package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int horasTrabajadas;
        double valorHora;
        int opcion;
        boolean bandera = true;
        String presentacionFinal;
        int cantidad;
        System.out.println("Cuantos empleados van a ser calculados:");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el valor de la hora trabajada:");
        valorHora = entrada.nextDouble();
        entrada.nextLine();

        for (int i = 0; i < cantidad; i++){
            System.out.println("\nIngrese el nombre del empleado:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese las horas Trabajadas");
            horasTrabajadas = entrada.nextInt();

            Empleado empleado = new Empleado(nombre, horasTrabajadas, valorHora);
            presentacionFinal = empleado.presentar();
            System.out.println(presentacionFinal);
            entrada.nextLine();
        }

    }
}
