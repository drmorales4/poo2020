package taller_repeticion;

public class Multiplicacion {
    /*
        Integrantes:
            Edgar Guamo
            David Morales
     */
    private int num1;
    private int num2;
    private int resultado = 0;

    public Multiplicacion(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int obtenerResultado(){
        int cont = 0;
        while (cont < num2){
            resultado = resultado + num1;
            cont = cont + 1;
        }
        return resultado;
    }

}
