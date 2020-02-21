package matricesPOO;
import java.util.Scanner;
public class EjecutaSumaMatrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        String presentacion = "";

        for (int i=0; i < a.length; i ++){
            for (int j=0; j < a.length; j++){
                System.out.printf("Ingrese el numero %d - %d en la matriz A: ", i, j);
                a[i][j] = entrada.nextInt();
            }
        }
        for (int i=0; i < b.length; i ++){
            for (int j=0; j < b.length; j++){
                System.out.printf("Ingrese el numero %d - %d en la matriz B: ", i, j);
                b[i][j] = entrada.nextInt();
            }
        }

        SumaMatrices sumaMatrices = new SumaMatrices(a, b);
        System.out.printf("Matriz A:\n%s",sumaMatrices.presentar(a));
        System.out.printf("Matriz B:\n%s", sumaMatrices.presentar(b));
        System.out.printf("\nSuma de las dos Matrices:\n%s", sumaMatrices.presentar(sumaMatrices.sumadeMatrices()));

    }
}
