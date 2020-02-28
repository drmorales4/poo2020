package herenciafigura;
/*
    Clase hija cuadrado, tendra todos los atributos de la clase Figura
 */
public class Cuadrado extends Figura{
    // variables
    private double lado;
    private double areaCua;

    /*
        Metodo construcctor
     */
    public Cuadrado(double lado){
        this.lado = lado;
    }

    /*
        Metodo para calcular el area del cuadrado
     */
    public double calcularAreaCuadrado(){
        areaCua = Math.pow(lado,2);
        return areaCua;
    }
}
