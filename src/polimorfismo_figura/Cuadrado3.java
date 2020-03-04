package polimorfismo_figura;

public class Cuadrado3 extends Figura3{
    private double lado;

    /*
        Metodo construcctor
     */
    public Cuadrado3 (double lado, String nombre){
        this.nombre = nombre;
        this.lado = lado;
    }
    /*
        Metodo para calcular el area del cuadrado
     */
    @Override
    public void calcularArea() {
        area = Math.pow(lado,2);
    }
}
