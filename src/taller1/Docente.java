package taller1;

public class Docente {
    private String nombre;
    private int edad;
    private String genero;
    private String materia;
    private String nacionalidad;
    private String especializacion;

    public String obtenerNombre(){

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
    public String obtenerMateria(){

        return materia;
    }
    public String obtenerEspecializacion(){

        return especializacion;
    }

    public String enserñar(){
        String cadena = String.format("%s\n%d\n%s\n%s\n%s\n%s\n" , nombre, edad, nacionalidad, genero, materia, especializacion);
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
    public void setMateria(String materia){
        this.materia = materia;
    }
    public void setEspecializacion(String especializacion){
        this.especializacion = especializacion;
    }
}
