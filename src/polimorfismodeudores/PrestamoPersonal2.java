package polimorfismodeudores;

public class PrestamoPersonal2 extends ClienteDeudor2{

    public PrestamoPersonal2 (String numeroCliente, String nombre, String numeroCuenta, double capitalPrestado, double tasa, int plazo){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.capitalPrestado = capitalPrestado;
        this.tasa = tasa;
        this.plazo = plazo;
    }

    @Override
    public void calcularInteresPagar() {
        interes = (capitalPrestado * (tasa/100)) * plazo;
    }
}
