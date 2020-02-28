package herenciafigura;
/*
    Clase hija circulo, tendra todos los atributos de la clase Figura
 */
public class Circulo extends Figura{
    // variables
    private double radio;
    private double pi;
    private double areaCir;

    /*
        Metodo construcctor
     */
    public Circulo(double radio){
        this.radio = radio;
    }

    /*
        Metodo para calcular el area del circulo
     */
    public double calcularAreaCirculo(){
        pi = 3.14;
        areaCir = pi * Math.pow(radio,2);
        return areaCir;
    }

}
