package herencia_empleado;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        // variables
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cargo;
        String dependencia;
        int horas;
        double valorHora;
        double sueldoMensual;

        // un menu para ingresar datos de empleado con sueldo por horas o sueldo fijo
        System.out.println("\nDigite 1: para presentar sueldo de empleado por horas");
        System.out.println("Digite 2: para presentar sueldo de empleado mensual");
        int opcion = entrada.nextInt();
        // limpieza de la entrada
        entrada.nextLine();

        // switch con 2 opciones
        switch (opcion) {
            case 1:
                // creamos objeto de EmpleadoHoras el sueldo es por las horas trabajadas y el valor de las horas
                EmpleadoHoras empleadoHoras = new EmpleadoHoras();
                System.out.println("\nIngrese el nombre del emplado: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = entrada.nextLine();
                System.out.println("Ingrese dependencia a la que pertenece: ");
                dependencia = entrada.nextLine();
                System.out.println("Ingrese el numero de horas trabajadas: ");
                horas = entrada.nextInt();
                System.out.println("Ingrese el valor por cada hora: ");
                valorHora = entrada.nextDouble();

                empleadoHoras.setNombre(nombre);
                empleadoHoras.setCargo(cargo);
                empleadoHoras.setDependencia(dependencia);
                empleadoHoras.setHoras(horas);
                empleadoHoras.setHoras(horas);
                empleadoHoras.setValorHora(valorHora);

                // imprimir datos de EmpleadoHoras
                System.out.println("\n-------------------------------");
                System.out.println("\nDatos empleado por horas");
                System.out.println("Nombre: " +empleadoHoras.getNombre());
                System.out.println("Cargo: " +empleadoHoras.getCargo());
                System.out.println("Dependencia: " +empleadoHoras.getDependencia());
                System.out.println("Sueldo: " +empleadoHoras.calcularSueldoH());
                break;

            case 2:
                // creamos objeto de EmpleadoAsalariado o empleado con sueldo fijo
                EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado();
                System.out.println("\nIngrese el nombre del empleado: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el cargo: ");
                cargo = entrada.nextLine();
                System.out.println("Ingrese dependencia: ");
                dependencia = entrada.nextLine();
                System.out.println("Ingrese valor mensual del sueldo: ");
                sueldoMensual = entrada.nextDouble();

                empleadoAsalariado.setNombre(nombre);
                empleadoAsalariado.setCargo(cargo);
                empleadoAsalariado.setDependencia(dependencia);
                empleadoAsalariado.setSueldoMensual(sueldoMensual);

                // imprimir datos de empleadoAsalariado
                System.out.println("\n-------------------------------");
                System.out.println("\nDatos empleado por valor mensual");
                System.out.println("Nombre: " +empleadoAsalariado.getNombre());
                System.out.println("Cargo: " +empleadoAsalariado.getCargo());
                System.out.println("Dependencia: " +empleadoAsalariado.getDependencia());
                System.out.println("Sueldo: " +empleadoAsalariado.getSueldoMensual());
                break;

            default:
                System.out.println("No existe esa opción");
        }
    }
}
