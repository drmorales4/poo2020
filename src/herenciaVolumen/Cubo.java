package herenciaVolumen;

public class Cubo extends Figura{
    private double arista;
    private double volumenCubo;

    public Cubo(double arista){
        this.arista = arista;
    }

    public double calcularVolumenCubo(){
        volumenCubo = Math.pow(arista,3);
        return volumenCubo;
    }
}
