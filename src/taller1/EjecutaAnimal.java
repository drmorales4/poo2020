package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNombreComun("Gato");
        animal.setEspecie("Felinos");
        animal.setColor("Gris");
        animal.setTipo("Domestico");
        animal.setGenero("hembra");

        String presentacion = animal.datosAnimal();
        System.out.println(presentacion);

    }
}
