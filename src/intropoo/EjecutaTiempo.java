package intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
        // creacion de objeto tiempo
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(51);
        tiempo.actualizar_segundo(35);
        String mostrarTiempo = tiempo.obtener_tiempo();
        System.out.println(mostrarTiempo);
    }
}