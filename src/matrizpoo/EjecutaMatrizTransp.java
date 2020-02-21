/*
    Integrantes: Diana Serrano, Nohelia Ludeña, Shomira Rosales, David Morales
 */
package matrizpoo;
import java.util.Scanner;
public class EjecutaMatrizTransp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidad1;
        int cantidad2;
        String presentar;
        System.out.println("Ingrese la cantidad de comlunas de la matriz: ");
        cantidad1 = entrada.nextInt();
        System.out.println("Ingrese la cantidad de filas de la matriz: ");
        cantidad2 = entrada.nextInt();

        int[][] matriz = new int[cantidad1][cantidad2];

        for (int i=0; i < cantidad1; i ++){
            for (int j=0; j < cantidad2; j++){
                System.out.printf("Ingrese el numero %d - %d en la matriz: ", i, j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        MatrizTransp ejercicio2 = new MatrizTransp(cantidad1, cantidad2, matriz);

        System.out.println("\nMatriz Original");
        for (int a=0; a < matriz.length; a ++) {
            for (int k = 0; k < matriz[a].length; k++) {
                System.out.print(matriz[a][k] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz Transpuesta");
        for (int b=0; b < ejercicio2.transponer().length; b ++){
            for (int c=0; c < ejercicio2.transponer()[b].length; c++){
                System.out.print(ejercicio2.transponer()[b][c] + "\t" );
            }
            System.out.println();
        }

    }
}