package herenciaDeuda;

public class PrestamoHipotecario extends ClienteDeudor {
    private double capitalPrestado;
    private double tasa;
    private double plazo;
    private double interes;

    public PrestamoHipotecario (double capitalPrestado, double tasa, double plazo){
        this.capitalPrestado = capitalPrestado;
        this.tasa = tasa;
        this.plazo = plazo;
    }

    public double calcularInteres(){

        interes = (capitalPrestado * (tasa/100)) * plazo;
        return interes;
    }
}
