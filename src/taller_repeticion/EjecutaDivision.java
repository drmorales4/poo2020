package taller_repeticion;
import java.util.Scanner;
public class EjecutaDivision {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;
        System.out.println("Ingrese el primer numero:");
        resultado = entrada.nextInt();
        System.out.println("Ingrese el segudo numero:");
        num2 = entrada.nextInt();
        num1 = resultado;
        Division division= new Division(resultado, num2);

        division.setNum1(num1);
        division.obtenerResultado();
        System.out.printf("\nEl resultado de la Division %d / %d = %d",
                division.getNum1(), division.getNum2(), division.getResultado());

    }
}
