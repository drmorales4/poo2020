package arreglos_POO;

import java.util.Scanner;

public class EjecutaSumaArreglos {
    /*
        Daniel Medina, David Morales
     */
    public static void main(String[] args){
        // declarar variables
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];


        // importacion de scanner
        SumaArreglos sumaR = new SumaArreglos();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores del vector A");
        for (int contador = 0; contador < arreglo1.length; contador++ ){
            arreglo1[contador] = entrada.nextInt();
        }

        System.out.println("Ingrese los valores del vector B");
        for (int contador = 0; contador < arreglo2.length; contador++ ){
            arreglo2[contador] = entrada.nextInt();
        }
        // establecer valor el objeto
        sumaR.setVectorA(arreglo1);
        sumaR.setVectorB(arreglo2);
        // calcular sumatoria
        sumaR.getVectorA();
        sumaR.getVectorB();
        sumaR.suma_arreglos();
        // presentacion
        System.out.println("La suma de los datos es la siguiente ");
        int[] suma = sumaR.getSuma();
        for (int i = 0; i < 9; i++){
            System.out.println(arreglo1[i]+"+"+arreglo2[i]+"="+suma[i]);
        }



    }
}
