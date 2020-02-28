package herenciafigura;
/*
    Clase hija triangulo, tendra todos los atributos de la clase Figura
 */
public class Triangulo extends Figura{
    // variables
    private double baseTrian;
    private double alturaTrian;
    private double areaTrian;

    /*
        Metodo construcctor
     */
    public Triangulo(double baseTrian, double alturaTrian){
        this.baseTrian = baseTrian;
        this.alturaTrian = alturaTrian;
    }

    /*
        Metodo para calcular el area del triangulo
     */
    public double calcularAreaTriangulo(){

        areaTrian = (baseTrian * alturaTrian) / 2;

        return areaTrian;
    }
}
