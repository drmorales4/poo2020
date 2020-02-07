package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
        Docente docente = new Docente();
        docente.setNombre("Juan");
        docente.setEdad(30);
        docente.setNacionalidad("ecuatoriano");
        docente.setGenero("masculino");
        docente.setMateria("Programacion");
        docente.setEspecializacion("Desarrollo de Software");

        String presentacion = docente.enserñar();
        System.out.println(presentacion);

    }
}
