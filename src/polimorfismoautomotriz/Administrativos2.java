package polimorfismoautomotriz;

public class Administrativos2 extends EmpleadoA2{
    private double sueldoMensual;

    public Administrativos2 (double sueldoMensual, String nombre){

        this.sueldoMensual = sueldoMensual;
        this.nombre = nombre;
    }

    @Override
    public void calcularSueldoQ() {
        sueldoQ = sueldoMensual / 2;
    }
}
