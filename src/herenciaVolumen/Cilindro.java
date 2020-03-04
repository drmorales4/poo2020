package herenciaVolumen;

public class Cilindro extends Figura{
    private double radioCilindro;
    private double aluraCilindro;
    private double pi;
    private double volumenCilindro;

    public Cilindro(double radioCilindro, double aluraCilindro){
        this.radioCilindro = radioCilindro;
        this.aluraCilindro = aluraCilindro;
    }

    public double calcularVolumenCilindro(){
        pi = 3.14;
        volumenCilindro = pi * Math.pow(radioCilindro, 2) * aluraCilindro;
        return volumenCilindro;
    }

}
