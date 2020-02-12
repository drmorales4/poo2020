package diseñoPOO;
import java.util.Scanner;
public class EjecutaEstudiante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante:");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la materia:");
        String materia = entrada.nextLine();
        System.out.println("Nota del 1er Bimestre:");
        double nota1 = entrada.nextDouble();
        System.out.println("Nota del 2do Bimestre:");
        double nota2 = entrada.nextDouble();

        Estudiante estudiante = new Estudiante(nombre, apellido, materia, nota1, nota2);

        String presentacionNotas = estudiante.presentar();
        System.out.println(presentacionNotas);

    }
}
