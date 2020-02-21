package matrizpoo;

public class SumaMatrices {
    private int [][] a = new int[3][3];
    private int [][] b = new int[3][3];
    private int [][] c = new int[3][3];
    private String mensaje;

    public SumaMatrices(int[][] a, int[][] b){
        this.a = a;
        this.b = b;
    }

    public int[][] sumadeMatrices(){
        for (int i=0; i < a.length; i ++){
            for (int j=0; j < b.length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public String presentar(int[][] matriz){
        mensaje = "";
        for (int k=0; k < a.length; k++){
            for (int c=0; c < a.length; c++){
                mensaje = String.format("%s\t%d\t", mensaje, matriz[k][c]);
            }
            mensaje = String.format("%s\n", mensaje);
        }
        return mensaje;
    }

}
