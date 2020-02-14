package taller_repeticion;
import java.util.Scanner;
public class EjecutaMultiplicacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        double presentar;
        System.out.println("Ingrese el primer numero:");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segudo numero:");
        num2 = entrada.nextInt();

        Multiplicacion multiplicacion = new Multiplicacion(num1, num2);

        presentar = multiplicacion.obtenerResultado();
        System.out.printf("\nEl resultado de la Multiplicacion %d x %d = %.1f", num1, num2, presentar);

    }
}
