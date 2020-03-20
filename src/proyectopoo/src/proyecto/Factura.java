/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author DAVID
 */
public class Factura {
    
    
    private String tipoProducto1;
    private String codigo1;
    private String nombre1;
    private String medida1;
    private double cantidad1;
    private double precio1;

    public Factura(String tipoProducto1, String codigo1, String nombre1, String medida1, double cantidad1, double precio1) {
        this.tipoProducto1 = tipoProducto1;
        this.codigo1 = codigo1;
        this.nombre1 = nombre1;
        this.medida1 = medida1;
        this.cantidad1 = cantidad1;
        this.precio1 = precio1;
    }

    /**
     * @return the tipoProducto1
     */
    public String getTipoProducto1() {
        return tipoProducto1;
    }

    /**
     * @param tipoProducto1 the tipoProducto1 to set
     */
    public void setTipoProducto1(String tipoProducto1) {
        this.tipoProducto1 = tipoProducto1;
    }

    /**
     * @return the codigo1
     */
    public String getCodigo1() {
        return codigo1;
    }

    /**
     * @param codigo1 the codigo1 to set
     */
    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1;
    }

    /**
     * @return the nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * @param nombre1 the nombre1 to set
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * @return the medida1
     */
    public String getMedida1() {
        return medida1;
    }

    /**
     * @param medida1 the medida1 to set
     */
    public void setMedida1(String medida1) {
        this.medida1 = medida1;
    }

    /**
     * @return the cantidad1
     */
    public double getCantidad1() {
        return cantidad1;
    }

    /**
     * @param cantidad1 the cantidad1 to set
     */
    public void setCantidad1(double cantidad1) {
        this.cantidad1 = cantidad1;
    }

    /**
     * @return the precio1
     */
    public double getPrecio1() {
        return precio1;
    }

    /**
     * @param precio1 the precio1 to set
     */
    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }
    
    
    
    
}
