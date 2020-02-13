package deber_seleccion;

public class Calificaciones {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double calificacion4;

    /**
     *  Construcctor
     * @param nombre
     * @param calificacion1
     * @param calificacion2
     * @param calificacion3
     * @param calificacion4
     */
    public Calificaciones(String nombre, double calificacion1, double calificacion2, double calificacion3, double calificacion4){
        this.nombre = nombre;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.calificacion4 = calificacion4;
    }

    /**
     *  Metodo para calcualr el promedio
     * @return promedio
     */
    public double sacarPromedio(){
        double promedio;
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4;

        return promedio;
    }

    /**
     *  Metodo para saber si aprobo o no segun la nota
     * @return comentario
     */
    public String calificar(){
        String comentario = "";
        if (sacarPromedio() >= 60){
            comentario = "Aprovado";
        }else{
            if (sacarPromedio() < 60){
                comentario = "Reprovado";
            }
        }
        return comentario;
    }

    /**
     *  Metodo para imprimir en pantalla
     * @return
     */
    public String presentar(){
        String cadena = "";
        cadena = String.format("\nNombre: %s\nPromedio: %.2f\n%s\n", nombre, sacarPromedio(), calificar());

        return cadena;
    }


}
