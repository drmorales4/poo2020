package taller1;

public class Estudiante {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String genero;
    private String carrera;

    public String obtenerNombre(String nombre){

        return nombre;
    }
    public int obtener_edad(){

        return edad;
    }
    public String obtenerNacionalidad(){

        return nacionalidad;
    }
    public String obtenerGenero(){

        return genero;
    }
    public String obtenercarrera(){

        return carrera;
    }

    public String estudiar(){
        String cadena = String.format("%s\n%d\n%s\n%s\n%s" , nombre, edad, nacionalidad, genero, carrera);
        return cadena;
    }
    // ----------------------------------------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }



}
