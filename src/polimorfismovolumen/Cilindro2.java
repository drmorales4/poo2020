package polimorfismovolumen;

public class Cilindro2 extends FiguraV2{
    private double pi = 3.14;
    private double radio;
    private double altura;

    public Cilindro2 (double radio, double altura, String nombre){
        this.radio = radio;
        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = pi * Math.pow(radio, 2) * Math.pow(altura,2);
    }
}
