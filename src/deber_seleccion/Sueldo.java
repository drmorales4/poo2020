package deber_seleccion;

public class Sueldo {
    private String nombre;
    private int horas;
    private double valor;
    private double sueldo;

    /**
     *  Construcctor
     * @param nombre
     * @param horas
     * @param cuota
     */
    public Sueldo(String nombre, int horas, double cuota){
        this.nombre = nombre;
        this.horas = horas;
        this.valor = cuota;
    }

    /**
     *  Metodo para obtener sueldo
     * @return sueldo
     */
    public double obtenerSueldo(){
        if (horas <= 50){
            sueldo = horas * valor;
        }else{
            if (horas >= 50){
                sueldo = (50 * valor) + ((horas - 50) * (valor * 3));
            }
        }
        return sueldo;
    }

    /**
     * Metodo para imprimir en pantalla el mensaje
     * @return
     */
    public String presentar(){
        String cadena = "";
        cadena = String.format("\nNombre: %s\nHoras Trabajadas: %d\nValor por hora: %.2f\nSUELDO: %.2f",
                nombre, horas, valor, obtenerSueldo());
        return cadena;
    }


}
