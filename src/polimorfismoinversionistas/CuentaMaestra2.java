package polimorfismoinversionistas;

public class CuentaMaestra2 extends Inversionista2{
    public CuentaMaestra2 (String numeroCliente, String nombre, String numeroCuenta, double capital, double tasa, int plazo){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.tasa = tasa;
        this.plazo = plazo;
    }

    @Override
    public void calcularInteres() {
        tasa = (tasa/100) * (1/365);
        interes = (capital * tasa) * plazo;
    }
}
