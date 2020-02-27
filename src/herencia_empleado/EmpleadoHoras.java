package herencia_empleado;
/**
    Clase que hereda de la clase Empleado
    Contendra todos los atributos y metodos definidos en Empleado
 */
public class EmpleadoHoras extends Empleado{
    // variables
    private int horas;
    private double valorHora;
    private double sueldo;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /*
        Metodo para calcular el sueldo
        @return sueldo
     */
    public double calcularSueldoH(){
        sueldo = (horas * valorHora);
        return sueldo;
    }

}
