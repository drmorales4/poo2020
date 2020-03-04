package polimorfismo_poo;
import java.util.Scanner;
public class EjecutaEmpleado12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        EmpleadoPorHoras2 empleadoPorHoras2 = new EmpleadoPorHoras2();
        System.out.println("\nCalculo sueldo quincenal empleado por horas.");
        System.out.println("Ingrese horas trabajadas");
        empleadoPorHoras2.setHoras(entrada.nextDouble());
        System.out.println("Ingrese valor horas: ");
        empleadoPorHoras2.setCuotaHoras(entrada.nextDouble());
        empleadoPorHoras2.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: " + empleadoPorHoras2.getSueldo());

        EmpleadoAsalariado2 empleadoAsalariado2 = new EmpleadoAsalariado2();
        System.out.println("\n\nCalculo sueldo quincenal empleado asalariado.");
        System.out.println("Ingrese sueldo mensual: ");
        empleadoAsalariado2.setSueldoMensual(entrada.nextDouble());
        empleadoAsalariado2.calcularSueldoQna();
        System.out.println("El sueldo quincenal es: " + empleadoAsalariado2.getSueldo());

    }
}
