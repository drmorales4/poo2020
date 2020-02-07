package intropoo;

public class Tiempo {
    // definicion de atributos globales
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * Metodo para obtener el valor de la variable hora
     * @return this.hora
     */
    public int obtener_hora(){

        return hora;
    }

    /**
     * Metodo para pbtener el valor de la varialble minuto
     * @return
     */
    public int obtener_minuto(){

        return minuto;
    }

    /**
     * Medoto para obtener el valor de la variable segundo
     * @return
     */
    public int obtener_segundo(){

        return segundo;
    }

    /**
     *
     */
    public  String obtener_tiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * Metodo para actulizar la hora
     * @param hora
     */
    public void actualizar_hora(int hora){
        // con el this hacemos referencia a variables globales
        this.hora = hora;
    }

    /**
     * Metodo para actualizar minutos
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto = minuto;
    }

    /**
     * Metodo para actulizar segundos
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        this.segundo = segundo;
    }

}
