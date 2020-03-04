package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12{
    private double horas;
    private double cuotaHoras;


    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setCuotaHoras(double cuotaHoras) {
        this.cuotaHoras = cuotaHoras;
    }

    @Override
    public void calcularSueldoQna() {
        sueldo = horas * cuotaHoras;
    }
}
