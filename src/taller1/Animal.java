package taller1;

public class Animal {
    private String nombreComun;
    private String especie;
    private String color;
    private String tipo;
    private String genero;

    public String obtenerNombreComun(){

        return nombreComun;
    }
    public String obtenerEspecie(){

        return especie;
    }
    public String obtenerColor(){

        return color;
    }
    public String obtenerTipo(){

        return tipo;
    }
    public String obtenerGenero(){

        return genero;
    }

    public String datosAnimal(){
        String cadena = String.format("%s\n%s\n%s\n%s\n%s\n" , nombreComun, especie, color, tipo, genero);
        return cadena;
    }

    // ----------------------------------------------
    public void setNombreComun(String nombreComun){
        this.nombreComun = nombreComun;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }


}
