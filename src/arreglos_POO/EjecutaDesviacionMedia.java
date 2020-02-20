package arreglos_POO;
    /*
        Daniel Medina, David Morales
     */
import java.util.Scanner;

public class EjecutaDesviacionMedia {
    public static void main(String[] args){
        // declarar variables
        int[] nums1 = new int[15];
        int i;
        // importacion de scanner
        DesviacionMedia desvia = new DesviacionMedia();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores del arreglo");
        for (i = 0; i < nums1.length; i++ ){
            nums1[i] = entrada.nextInt();
        }
        // establecer valor el objeto
        desvia.setNumeros(nums1);
        // calcular sumatoria
        desvia.calcular_media();
        desvia.calcular_desviacion();
        // presentacion
        int[] nums2 = desvia.getNumeros();
        int[] desv = desvia.getDesviacion();
        // Presentacion de variable
        System.out.println("Numeros DesviacionMedia");
        for (i = 0; i< nums1.length; i++){
            System.out.println(nums2[i] +"      "+ desv[i]);
        }
        System.out.println("La media es: \n" + desvia.getMedia());

    }

}
