package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaEjercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String binario;
        int resultado;
        int tamano;

        System.out.println("\nConvertir número binario a decimal");
        System.out.println("Ingrese el numero Binario: ");
        binario = entrada.nextLine();

        Ejercicio2 ejercicio2 = new Ejercicio2(binario);
        tamano = ejercicio2.convertir().length;
        resultado = ejercicio2.convertirBinario();
        System.out.printf("Tamaño del numero Binario: %d", tamano);
        System.out.printf("\nNumero Decimal: %d", resultado);
    }

}
