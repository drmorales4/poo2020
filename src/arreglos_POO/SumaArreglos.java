package arreglos_POO;
    /*
        Daniel Medina, David Morales
     */
public class SumaArreglos {
    private int[] vectorA = new int[10];
    private  int[] suma = new int[10];
    private int[] vectorB = new int[10];


    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getSuma() {
        return suma;
    }

    public void setSuma(int[] suma) {
        this.suma = suma;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public void suma_arreglos (){
        for (int i = 0; i < getVectorA().length; i++){
            getSuma()[i] =(getVectorA()[i] + getVectorB()[i]);
        }
    }
}
