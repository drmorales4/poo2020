package polimorfismoautomotriz;

public class Mecanicos2 extends EmpleadoA2{
    private double valorTrabajos;
    private double veces;

    public Mecanicos2 (double valorTrabajos, double veces, String nombre){
        this.valorTrabajos = valorTrabajos;
        this.veces = veces;
        this.nombre = nombre;
    }

    @Override
    public void calcularSueldoQ() {
        sueldoQ = (valorTrabajos * veces);
        sueldoQ = sueldoQ * 0.04;
    }
}
