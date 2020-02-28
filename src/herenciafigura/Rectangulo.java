package herenciafigura;
/*
    Clase hija rectangulo, tendra todos los atributos de la clase Figura
 */
public class Rectangulo extends Figura{
    // variables
    private double baseRec;
    private double alturaRec;
    private double areaRec;

    /*
        Metodo construcctor
     */
    public Rectangulo(double baseRec, double alturaRec){
        this.baseRec = baseRec;
        this.alturaRec = alturaRec;
    }

    /*
        Metodo para calcular el area del rectangulo
     */
    public double calcularAreaRectangulo(){

        areaRec = baseRec * alturaRec;

        return areaRec;
    }

}
