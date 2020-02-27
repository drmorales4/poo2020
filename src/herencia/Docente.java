package herencia;

public class Docente extends Persona{
    // atributos propios de esta clase
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseniar(){
        System.out.println("Metodo para enseñar");
    }
    public void calificar(){
        System.out.println("Metodo para calificar");
    }
}
