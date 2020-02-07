package taller1;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("David Morales");
        estudiante.setEdad(19);
        estudiante.setNacionalidad("Ecuatoriano");
        estudiante.setGenero("Masculino");
        estudiante.setCarrera("Computacion");

        String presentar = estudiante.estudiar();
        System.out.println(presentar);
    }
}
