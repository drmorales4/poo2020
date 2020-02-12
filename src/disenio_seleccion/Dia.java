package disenio_seleccion;

public class Dia {
    private int numero;


    /**
     *  Metodo para obtener numero
     * @return numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Metodo con el uso del swich
     * @return dia
     */
    public String obtenerDia() {
        String dia = "";
        switch (numero) {
            case 1:
                dia = ("Domingo");
                break;

            case 2:
                dia = ("Lunes");
                break;

            case 3:
                dia = ("Martes");
                break;

            case 4:
                dia = ("Miercoles");
                break;

            case 5:
                dia = ("Jueves");
                break;

            case 6:
                dia = ("Viernes");
                break;

            case 7:
                dia = ("Sabado");
                break;

            default:
                dia = ("Opcion Incorrecta");

        }
        return dia;
    }

    /**
     *  Metodo para presentar
     * @return cadena
     */
    public String presentar(){
        String cadena = obtenerDia().toUpperCase();
        return cadena;
    }

}

