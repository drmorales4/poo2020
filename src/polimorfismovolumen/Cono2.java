package polimorfismovolumen;

public class Cono2 extends FiguraV2{
    private double radio;
    private double altura;

    public Cono2 (double radio, double altura, String nombre){
        this.radio = radio;
        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = (Math.PI * Math.pow(radio,2) * altura) / 3;
    }
}
