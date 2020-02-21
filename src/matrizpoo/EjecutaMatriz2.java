/*
 * Taller Grupal
 * Integrantes:
 * Diana Serrano
 * David Morales
 * Nohelia Ludeña
 * Shomira Rosales*/

package matrizpoo;

import java.util.Scanner;
public class EjecutaMatriz2 {
    public static void main(String[] args) {

        // Crear objeto para entrada de datos por el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nCALCULA LA SUMA Y PROMEDIO DE  MATRICES\n");
        // ingreso de numero de columnas y de filas de la matriz
        System.out.println("Ingrese el numero de filas que desea para la matriz");
        int f = entrada.nextInt();

        System.out.println("Ingrese el numero de columnas que desea para la matriz");
        int c = entrada.nextInt();

        // Se declara, crea e inicia el objeto de la clase Vectores
        Matriz2 objMatriz = new Matriz2();
        // Variables
        int matriz[][] = new int[f][c];
        int sum = f + c +1;
        System.out.println(sum);
        System.out.println("___ INGRESO DE VALORES A LA MATRIZ   ____");
        for(int i=0; i< f;i++){
            for(int j= 0; j < c; j++){
                System.out.print("Ingrese los valores del  Vector para la posicion: [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        // Establecer
        objMatriz.setMatriz(matriz);
        objMatriz.setF(f);
        objMatriz.setC(c);
        objMatriz.getMatriz();


        // Calcular
        objMatriz.sumaMatriz();
        objMatriz.promedio();
        System.out.println("Suma de los valores de la  matriz: "+objMatriz.getSuma());
        System.out.println("Promedio de la matriz: "+objMatriz.getPromedio());

        // Imprimir
        System.out.println("--------- Salida ----------");
        System.out.println("Matriz A");
        objMatriz.presentarMatriz(objMatriz.getMatriz());

    }

}