/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author drmorales4
 */
public class Producto {
    
    private String tipoProducto;
    private String codigo;
    private String nombre;
    private String medida;
    private double cantidad;
    private double precio;

    public Producto(String tipoProducto, String codigo, String nombre, String medida, double cantidad, double precio) {
        this.tipoProducto = tipoProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.medida = medida;
        this.cantidad = cantidad;
        this.precio = precio;
    }
        
    /**
     * @return the tipoProducto
     */
    public String getTipoProducto() {
        return tipoProducto;
    }

    /**
     * @param tipoProducto the tipoProducto to set
     */
    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the medida
     */
    public String getMedida() {
        return medida;
    }

    /**
     * @param medida the medida to set
     */
    public void setMedida(String medida) {
        this.medida = medida;
    }

    /**
     * @return the cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
