package polimorfismodeudores;

public abstract class ClienteDeudor2 {
    protected String numeroCliente;
    protected String nombre;
    protected String numeroCuenta;
    protected double capitalPrestado;
    protected double tasa;
    protected double plazo;
    protected double interes;

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getCapitalPrestado() {
        return capitalPrestado;
    }

    public void setCapitalPrestado(double capitalPrestado) {
        this.capitalPrestado = capitalPrestado;
    }

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public double getInteres() {
        return interes;
    }

    public abstract void calcularInteresPagar();
}
