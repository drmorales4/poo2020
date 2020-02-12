package diseñoPOO;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String materia;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, String apellido, String materia, double nota1, double nota2){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setMateria(materia);
        this.setNota1(nota1);
        this.setNota2(nota2);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public double sacar(){
        double notaFinal = this.nota1 + this.nota2;
        return notaFinal;
    }

    public String pasar(){
        String mensaje = "";

        if (sacar() >= 28){
            mensaje = "Aprueba con normalidad";
        }if (sacar() <= 27){
            mensaje = "Queda a Supletorios";
        }
        return mensaje;
    }

    public String presentar(){
        String cadena = "";
        if (sacar() >= 28){
            cadena = String.format("\nNombres: %s\nApellidos: %s\nMateria: %s\nNota Primer Bimestre: %.2f\nNota " +
                            "Segundo Bimestre: %.2f\nPromedio: %.2f\nMensaje: %s", nombre, apellido, materia, nota1,
                    nota2, sacar(), pasar());
        }else {
            if (sacar() <= 27){
                cadena = String.format("\nNombres: %s\nApellidos: %s\nMateria: %s\nNota Primer Bimestre: %.2f\nNota " +
                                "Segundo Bimestre: %.2f\nPromedio: %.2f\nMensaje: %s", nombre, apellido, materia,
                        nota1, nota2, sacar(),pasar());
            }
        }

        return cadena;
    }
}
