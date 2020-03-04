package herenciaBanco;

public class CuentaAhorro extends Inversionista {
    private double interes;
    private double capital;
    private double tasaInteres;
    private int plazo;

    public CuentaAhorro(double capital, double tasaInteres, int plazo){
        this.capital = capital;
        this.tasaInteres = tasaInteres;
        this.plazo = plazo;
    }

    public double obtenerIntereses(){
        interes = (capital * (tasaInteres/100)) * plazo;
        interes = interes / 365;
        return interes;
    }

}
