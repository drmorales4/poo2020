package polimorfismo_poo;

public abstract class Empleado12 {

    protected String nommbre;
    protected String departamentp;
    protected String puesto;
    protected double sueldo;

    /*
        Metodo abstracto, que sera implementado
        detro de las clases hijas.
     */
    public abstract void calcularSueldoQna();

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getDepartamentp() {
        return departamentp;
    }

    public void setDepartamentp(String departamentp) {
        this.departamentp = departamentp;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

}
