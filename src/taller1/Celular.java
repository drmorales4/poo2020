package taller1;

public class Celular {
    private String marca;
    private String modelo;
    private int peso;
    private int pulgadas;
    private String color;

    public String obtenerMarca(){

        return marca;
    }
    public String obtenerModelo(){

        return modelo;
    }
    public int obtenerPeso(){

        return peso;
    }
    public int obtenerpulgadas(){

        return pulgadas;
    }
    public String obtenerColor(){

        return color;
    }

    public String ejecutarCelular(){
        String cadena = String.format("Marca: %s\nModelo: %s\nPulgadas: %d\nPeso(en gramos): %d\nColor: %s\n" , marca, modelo, pulgadas, peso, color);
        return cadena;
    }


    // ----------------------------------------------
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setColor(String color){
        this.color = color;
    }

}
