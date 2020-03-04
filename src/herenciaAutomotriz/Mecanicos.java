package herenciaAutomotriz;

public class Mecanicos extends Empleado {
    private double valorTrabajos;
    private double veces;
    private double sueldoQ;

    public Mecanicos (double valorTrabajos, double veces){
        this.valorTrabajos = valorTrabajos;
        this.veces = veces;
    }

    public double calcularSueldoMec(){
        sueldoQ = (valorTrabajos * veces);
        sueldoQ = sueldoQ * 0.04;
        return sueldoQ;
    }

}
