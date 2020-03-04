package herenciaDeuda;

public class PrestamoPersonal extends ClienteDeudor {
    private double interes;
    private double capitalPrestado;
    private double tasa;
    private double plazo;

    public PrestamoPersonal(double capitalPrestado, double tasa, double plazo){
        this.capitalPrestado = capitalPrestado;
        this.tasa = tasa;
        this.plazo = plazo;
    }

    public double calcularInteres(){
        interes = (capitalPrestado * (tasa/100)) * plazo;
        return interes;
    }
}
