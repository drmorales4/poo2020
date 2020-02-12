package disenio_seleccion;

public class Empleado {
    private String nombre;
    private int horas;
    private double cuota;
    private double sueldo;

    /**
     *
     * @param nombre
     * @param horas
     * @param cuota
     *
     */
    public Empleado(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.cuota = cuota;
    }

    /**
     *
     * @return
     */
    public double obtenerSueldo(){
        if (horas <= 40){
            sueldo = horas * cuota;
        }else{
            if (horas >= 40){
                sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
            }
        }
        return sueldo;
    }

    /**
     *
     * @return
     */
    public String presentar(){
        String cadena = "";
        cadena = String.format("\nNombre: %s\nHoras Trabajadas: %d\nValor por hora: %.2f\nSUELDO: %.2f",
                nombre, horas, cuota, obtenerSueldo());
        return cadena;
    }



}
