package intropoo;

public class EjecutaPersona {
    public static void main(String[] args) {
        // creacion de objeto
        Persona persona = new Persona("Masculino", "Catolica", 19, "David");
        System.out.println(persona.getNombre());
        System.out.println("edad: " +persona.getEdad());
        System.out.println("religion: " +persona.getReligion());
        System.out.println("genero: " +persona.getGenero());

        // Persona persona2 = new Persona();

        // creacion de objeto con construcctor 2
        Persona persona2 = new Persona("Masculino", "Catolica", 19);
        Persona persona3 = new Persona("Femenino", "Ateo", 20);
        System.out.println("Edad persona 2: " +persona2.getEdad());
        System.out.println(("Edad persona 3: " +persona3.getEdad()));
        System.out.println("Nombre persona 2: " +persona2.getNombre());
    }
}
