package herenciaBanco;

public class Pagare extends Inversionista {
    private double interes;
    private double capital;
    private double tasaInteres;
    private int plazo;

    public Pagare(double capital, double tasaInteres, int plazo){
        this.capital = capital;
        this.tasaInteres = tasaInteres;
        this.plazo = plazo;
    }

    public double obtenerInteres(){
        interes = (capital * (tasaInteres / 100) * (plazo / 365));
        return interes;
    }

}
