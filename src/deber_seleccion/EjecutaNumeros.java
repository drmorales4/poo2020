package deber_seleccion;
import java.util.Scanner;
public class EjecutaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresar numero 1:");
        int numero1 = entrada.nextInt();
        System.out.println("Ingresar numero 2:");
        int numero2 = entrada.nextInt();
        System.out.println("Ingresar numero 3:");
        int numero3 = entrada.nextInt();
        System.out.println("Ingresar numero 4:");
        int numero4 = entrada.nextInt();

        Numeros numeros = new Numeros(numero1, numero2, numero3, numero4);

        String presentarNumero = numeros.sacarNumeroMayor();
        System.out.println(presentarNumero);
    }
}
