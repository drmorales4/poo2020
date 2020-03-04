package polimorfismo_poo;

public class EmpleadoAsalariado2 extends Empleado12{
    private double sueldoMensual;

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    /**
     * Implementacion del metodo abstracto que
     * fue definido en la clase padre
     */
    @Override
    public void calcularSueldoQna() {
        sueldo = sueldoMensual / 2;
    }
}
