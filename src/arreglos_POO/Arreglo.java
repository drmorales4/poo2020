package arreglos_POO;

public class Arreglo {
    private int[] vectorA = new int[10];
    private int[] vectorB = new int[10];
    private int sumatoria;
    private String mensaje = "";

    public Arreglo(int[] vectorA, int[] vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public int obtenerSumatoria(){
        sumatoria = 0;

        for (int i=0; i < vectorA.length; i++) {
            sumatoria = sumatoria + (vectorA[i] * vectorB[i]);
        }
        return sumatoria;
    }

    public String presentar(){
        mensaje = String.format("\nLa sumatoria del vector A y B es: %d", obtenerSumatoria());
        return mensaje;
    }
}
