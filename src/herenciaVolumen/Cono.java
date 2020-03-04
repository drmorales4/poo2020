package herenciaVolumen;

public class Cono extends Figura{
    private double radioCono;
    private double alturaCono;
    private double pi;
    private double volumenCono;

    public Cono (double radioCono, double alturaCono){
        this.radioCono = radioCono;
        this.alturaCono = alturaCono;
    }

    public double calcularVolumenCono(){
        pi = 3.14;
        volumenCono = (1/3) * (pi * Math.pow(radioCono,2) * alturaCono);
        return volumenCono;
    }

}
