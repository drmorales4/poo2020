package herenciaBanco;

public class CuentaMaestra extends Inversionista {
    private double interes;
    private double capital;
    private double tasaInteres;
    private int plazo;

    public CuentaMaestra (double capital, double tasaInteres, int plazo){
        this.capital = capital;
        this.tasaInteres = tasaInteres;
        this.plazo = plazo;
    }

    public double obtenerInteres(){
        tasaInteres = (tasaInteres/100) * (1/365);
        interes = (capital * tasaInteres) * plazo;
        return interes;
    }
}
