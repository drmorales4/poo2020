package herenciaAutomotriz;

public class Vendedores extends Empleado {
    private double salarioMin;
    private int cantidadVendidos;
    private double[] precioAuto = new double[cantidadVendidos];
    private double sueldoQ;

    public Vendedores(int cantidadVendidos, double[] precioAuto){
        this.cantidadVendidos = cantidadVendidos;
        this.precioAuto = precioAuto;
    }

    public double calcularSueldoVendedor(){
        sueldoQ = 0;
        salarioMin = 394;

        for (int i=0; i < precioAuto.length; i++){
            sueldoQ = sueldoQ + (precioAuto[i] * 0.02);
        }

        sueldoQ = sueldoQ + salarioMin;
        return sueldoQ;
    }

}
