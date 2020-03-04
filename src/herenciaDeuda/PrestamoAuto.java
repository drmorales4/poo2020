package herenciaDeuda;

public class PrestamoAuto extends  ClienteDeudor {
    private double capitalPrestado; // precio Auto
    private double tasa;
    private double plazo;
    private double interes;

    public PrestamoAuto (double capitalPrestado, double tasa, double plazo){
        this.capitalPrestado = capitalPrestado;
        this.tasa = tasa;
        this.plazo = plazo;
    }

    public double calcularInteres(){
        interes = (capitalPrestado * (tasa/100)) * plazo;
        return interes;
    }
}
