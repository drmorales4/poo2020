package polimorfismovolumen;
import java.util.Scanner;

public class EjecutaFiguraV2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variables
        String nombre;
        String mensaje = "";
        double arista, radio, altura, volumen;
        int opcion;
        System.out.println("CALCULAR VOLUMEN");
        System.out.println("Ingrese numero de la Figura: \n1. Cubo\n2. Cilindro\n3. Cono\n4. Esfera");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese arista del cubo: ");
                arista = entrada.nextDouble();
                nombre = "Cubo";

                Cubo2 cubo2 = new Cubo2(arista, nombre);
                cubo2.calcularVolumen();

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nArista: %.1f\nVOLUMEN: %.2f",
                        nombre, arista, cubo2.getVolumen());
                break;

            case 2:
                System.out.println("Ingrese el radio del cilindro: ");
                radio = entrada.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                altura = entrada.nextDouble();
                nombre = "Cilindro";

                Cilindro2 cilindro2 = new Cilindro2(radio, altura, nombre);

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio: %.1f\nAltura: %.1f\nVOLUMEN: " +
                        "%.2f",  nombre, radio, altura, cilindro2.getVolumen());
                break;

            case 3:
                System.out.println("Ingrese el radio del cono: ");
                radio = entrada.nextDouble();
                System.out.println("Ingrese la altura del cono: ");
                altura = entrada.nextDouble();
                nombre = "Cono";

                Cono2 cono2 = new Cono2(radio, altura, nombre);

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio: %.1f\nAltura: %.1f\nVOLUMEN: " +
                        "%.2f",  nombre, radio, altura, cono2.getVolumen());
                break;

            case 4:
                System.out.println("Ingrese el radio de la esfera: ");
                radio = entrada.nextDouble();
                nombre = "Esfera";

                Esfera2 esfera2 = new Esfera2(radio, nombre);

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio Esfera: %.1f\nVOLUMEN: %.2f",
                        nombre, radio, esfera2.getVolumen());
                break;

            default:
                mensaje = String.format("La opcion no es correcta");
        }
        System.out.println(mensaje);
    }
}