/*
    Integrantes: Diana Serrano, Nohelia Ludeña, Shomira Rosales, David Morales
 */
package matrizpoo;

public class MatrizTransp {
    private int cantidad1;
    private int cantidad2;
    private int[][] matriz = new int[cantidad1][cantidad2];

    public MatrizTransp(int cantidad1, int cantidad2, int[][] matriz){
        this.cantidad1 = cantidad1;
        this.cantidad2 = cantidad2;
        this.matriz = matriz;
    }

    public int[][] transponer(){
        int[][] transpuesta = new int[cantidad2][cantidad1];
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }


}