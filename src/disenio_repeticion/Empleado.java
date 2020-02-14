package disenio_repeticion;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double valorHora;
    private double sueldo;
    private String cadena = "";

    public Empleado(String nombre, int horasTrabajadas, double valorHora){
        this.setNombre(nombre);
        this.setHorasTrabajadas(horasTrabajadas);
        this.setValorHora(valorHora);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public double obtenerSueldo(){
        if (horasTrabajadas <= 40){
            sueldo = horasTrabajadas * valorHora;
        }else{
            if (horasTrabajadas >= 40){
                sueldo = (40 * valorHora) + ((horasTrabajadas - 40) * (valorHora * 2));
            }
        }
        return sueldo;
    }

    public String presentar(){
        cadena = String.format("%s\nNombre: %s\nHoras Trabajadas: %d\nValor por hora: %.2f\nSUELDO: %.2f",
                cadena, nombre, horasTrabajadas, valorHora, obtenerSueldo());
        return cadena;
    }


}
