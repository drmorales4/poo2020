package taller_repeticion;

public class Cajero {
    /*
        Integrantes:
            Edgar Guamo
            David Morales
     */
    private String nombre;
    private double saldoIncial;
    private int opcion;
    private double valor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoIncial() {
        return saldoIncial;
    }

    public void setSaldoIncial(double saldoIncial) {
        this.saldoIncial = saldoIncial;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double calcularSaldo() {
        if (opcion == 1) {
            saldoIncial = saldoIncial - valor;
        } else{
            if (opcion == 2) {
                saldoIncial = saldoIncial + valor;
            } else{
                System.out.println(saldoIncial);
            }
        }
        return saldoIncial;
    }
}
