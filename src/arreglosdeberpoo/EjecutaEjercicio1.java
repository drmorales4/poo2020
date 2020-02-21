package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombre = new String[5];
        int[] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        String presentar = "";

        for (int i=0; i < nombre.length; i ++){
            System.out.printf("Ingrese el nombre de la persona %d: ", i);
            nombre[i] = entrada.nextLine();
            System.out.printf("Ingrese la edad de la persona %d: ", i);
            edad[i] = entrada.nextInt();
            entrada.nextLine(); // limpieza de buffer de entrada
            System.out.printf("Ingrese las iniciales de la Univerdad de la persona %d: ", i);
            universidad[i] = entrada.nextLine();
            System.out.printf("Ingrese el numero de celular de la persona %d: ", i);
            celular[i] = entrada.nextLine();
        }
        entrada.nextLine(); // limpieza de buffer de entrada

        Ejercicio1 ejercicio1 = new Ejercicio1(nombre, edad, universidad, celular);

        for (int j=0; j < nombre.length; j ++){
            presentar = String.format("\n%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n", presentar, nombre[j], edad[j], universidad[j], celular[j]);
        }
        System.out.println(presentar);

    }
}
