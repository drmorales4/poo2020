package taller1;

public class Universidad {
    private String nombre;
    private String carreras;
    private String ubicacion;
    private int numero_estudiantes;
    private String laboratorios;

    public String obtenerNombre(){

        return nombre;
    }
    public String obtenerCarreras(){

        return carreras;
    }
    public String obtenerUbicacion(){

        return ubicacion;
    }
    public int Numero_estudiantes() {

        return numero_estudiantes;
    }
    public String obtenerLaboratorios(){

        return laboratorios;
    }

    /*
    public String ejecutarCelular(){
        String cadena = String.format("Marca: %s\nModelo: %s\nPulgadas: %d\nPeso(en gramos): %d\nColor: %s\n" , nombre, modelo, pulgadas, peso, color);
        return cadena;
    }


    // ----------------------------------------------
    public void setNombre(String nombre){
        this.nombre = nombre;
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
*/
}
