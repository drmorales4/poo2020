package disenio_repeticion;

import java.util.Scanner;

public class EjecutaEmpleadoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int horasTrabajadas;
        double valorHora;
        int opcion;
        boolean bandera = true;
        String presentacionFinal;

        System.out.println("Ingrese el valor de la hora trabajada:");
        valorHora = entrada.nextDouble();
        entrada.nextLine();

        while (bandera == true){
            System.out.println("Ingrese el nombre del empleado:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese las horas Trabajadas");
            horasTrabajadas = entrada.nextInt();

            Empleado empleado = new Empleado(nombre, horasTrabajadas, valorHora);
            presentacionFinal = empleado.presentar();
            System.out.println(presentacionFinal);

            System.out.println("\n\nDesea seguir ingresando datos? \n1: SI\n2: NO");
            opcion = entrada.nextInt();
            if (opcion == 1){
                bandera = true;
            }else {
                if (opcion == 2){
                    bandera = false;
                }else {
                    bandera = true;
                }
            }
            entrada.nextLine();
        }
        entrada.nextLine();
        System.out.println("-- FIN PROCESOS --");
    }
}
