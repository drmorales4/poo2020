package herencia;

public class Administrativo extends Persona{
    // atributos propios de esta clase
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_Procesos(){
        System.out.println("Metodo para gestionar procesos");
    }
}
