package polimorfismovolumen;

public class Cubo2 extends FiguraV2{
    private double arista;

    public Cubo2 (double arista, String nombre){
        this.arista = arista;
        this.nombre = nombre;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista,3);
    }
}
