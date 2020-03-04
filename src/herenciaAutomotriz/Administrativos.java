package herenciaAutomotriz;

public class Administrativos extends Empleado {
    private double sueldoMensual;
    private double sueldoQ;

    public Administrativos (double sueldoMensual){
        this.sueldoMensual = sueldoMensual;
    }

    public double calcularSueldoAdm(){
        sueldoQ = sueldoMensual / 2;
        return sueldoQ;
    }
}
