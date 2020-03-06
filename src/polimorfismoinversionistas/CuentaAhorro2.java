package polimorfismoinversionistas;

public class CuentaAhorro2 extends Inversionista2 {

    public CuentaAhorro2 (String numeroCliente, String nombre, String numeroCuenta, double capital, double tasa, int plazo){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.tasa = tasa;
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres() {
        interes = (capital * (tasa/100)) * plazo;
        interes = interes / 365;
    }
}
