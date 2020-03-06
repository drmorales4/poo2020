package polimorfismoautomotriz;

public class Vendedores2 extends EmpleadoA2{
    private double salarioMin = 394;
    private int cantidadVendidos;
    private double[] precioAuto = new double[cantidadVendidos];


    public Vendedores2 (int cantidadVendidos, double[] precioAuto, String nombre){
        this.nombre = nombre;
        this.cantidadVendidos = cantidadVendidos;
        this.precioAuto = precioAuto;
    }

    @Override
    public void calcularSueldoQ() {
        for (int i=0; i < precioAuto.length; i++){
            sueldoQ = sueldoQ + (precioAuto[i] * 0.02);
        }
        sueldoQ = sueldoQ + salarioMin;
    }
}
