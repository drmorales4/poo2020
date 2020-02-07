package diseñoPOO;

public class Cerveza {
    private double precio;
    private int unidades;
    private String nombre;
    private String tipo;


    public Cerveza(double precio, int unidades, String tipo, String nombre) {
        this.precio = precio;
        this.unidades = unidades;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double resultado(){
        double totalVenta = this.precio * this.unidades;
        return totalVenta;
    }
    public String presentar(){
        String cadena = String.format("-----------------------------\nCerveza: %s\nTipo: %s\nPrecio: %.2f\n" +
                "Unidades Vendidas: %d\n\nTOTAL VENTAS: $ %.2f\n-----------------------------" +
                "", nombre, tipo, precio, unidades, resultado());
        return cadena;
    }


}
