package arreglos_POO;
import java.util.Scanner;
public class EjecutaArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        String presentar;

        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("Ingrese un numero al arreglo A (%d): ", i);
            vectorA[i] = entrada.nextInt();
            System.out.printf("Ingrese un numero al arreglo B (%d): ", i);
            vectorB[i] = entrada.nextInt();
        }
        Arreglo arreglo = new Arreglo(vectorA, vectorB);
        presentar = arreglo.presentar();
        System.out.println(presentar);
    }
}
