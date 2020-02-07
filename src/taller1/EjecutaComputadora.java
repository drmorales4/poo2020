package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.setMarca("DELL");
        computadora.setProcesador("intel");
        computadora.setTamañoPulgadas(17);
        computadora.setPeso(2);
        computadora.setColor("Gris");

        String presentacion = computadora.ejecutar();
        System.out.println(presentacion);
    }
}
