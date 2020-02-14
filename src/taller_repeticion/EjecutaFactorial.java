package taller_repeticion;

import java.util.Scanner;

public class EjecutaFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número a factorizar");
        int num = teclado.nextInt();

        Factorial factorial = new Factorial();

        factorial.setNum(num);
        factorial.calcularFactorial();
        System.out.println(factorial.getFactorial());
    }
}
