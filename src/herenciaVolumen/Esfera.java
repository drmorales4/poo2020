package herenciaVolumen;

public class Esfera extends Figura{
    private double radioEsf;
    private double pi;
    private double volumenEsf;

    public Esfera (double radioEsf){
        this.radioEsf = radioEsf;
    }

    public double calcularVolumenEsfera(){
        pi = 3.14;
        volumenEsf = (4/3) * (pi * Math.pow(radioEsf,3));
        return volumenEsf;
    }
}
