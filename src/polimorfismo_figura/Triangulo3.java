package polimorfismo_figura;

public class Triangulo3 extends Figura3{
    private double base;
    private double altura;

    public Triangulo3 (double base, double altura, String nombre){
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
}
