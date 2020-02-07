package taller1;

public class Computadora {
    private String marca;
    private String procesador;
    private  int tamañoPulgadas;
    private int peso;
    private String color;

    public String obtenerMarca(){

        return marca;
    }
    public String obtenerProcesador(){

        return procesador;
    }
    public int obtenerTamañoPulgadas(){

        return tamañoPulgadas;
    }
    public  int obtenerpeso() {

        return peso;
    }
    public String obtenerColor(){

        return color;
    }

    public String ejecutar(){
        String cadena = String.format("Marca: %s\nProcesador: %s\nPulgadas: %d\nPeso(en kg): %d\nColor: %s\n" , marca, procesador, tamañoPulgadas, peso, color);
        return cadena;
    }


    // ----------------------------------------------
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    public void setTamañoPulgadas(int tamañoPulgadas){
        this.tamañoPulgadas = tamañoPulgadas;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setColor(String color){
        this.color = color;
    }

}
