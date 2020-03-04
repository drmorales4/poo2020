package polimorfismo_figura;

public class Circulo3 extends Figura3{
    private double radio;
    private double pi = 3.14;

    /*
        Metodo construcctor
     */
    public Circulo3 (double radio, String nombre){
        this.nombre = nombre;
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        area = pi * Math.pow(radio,2);
    }
}
