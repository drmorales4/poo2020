package arreglos_POO;
    /*
        Daniel Medina, David Morales
     */
public class DesviacionMedia {
    private int[] numeros = new int[15];
    private  int media;
    private int[] desviacion = new int[15];


    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int[] getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(int[] desviacion) {
        this.desviacion = desviacion;
    }
    public void calcular_media(){
        int sumatoria = 0;
        int i;
        for ( i = 0 ; i <= 14; i++){
            sumatoria = sumatoria+numeros[i];
        }
        media = sumatoria / i;
    }
    public void calcular_desviacion(){
        int j;
        for (j = 0; j<= 14; j++){
            desviacion[j] = numeros[j] - media;
        }

    }
}
