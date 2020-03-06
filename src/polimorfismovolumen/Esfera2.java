package polimorfismovolumen;

public class Esfera2 extends FiguraV2{
    private double radio;

    public Esfera2 (double radio, String nombre){
        this.radio = radio;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = (4 * Math.PI * Math.pow(radio,3)) / 3;
    }
}
