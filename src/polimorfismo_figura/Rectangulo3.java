package polimorfismo_figura;

public class Rectangulo3 extends Figura3{
    private double baseRec;
    private double alturaRec;

    public Rectangulo3 (double baseRec, double alturaRec, String nombre){
        this.baseRec = baseRec;
        this.alturaRec = alturaRec;
        this.nombre = nombre;
    }

    @Override
    public void calcularArea() {
        area = baseRec * alturaRec;
    }
}
