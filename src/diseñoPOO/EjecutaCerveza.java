package diseñoPOO;
import java.util.Scanner;
public class EjecutaCerveza {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cerveza:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo:");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese el costo por unidad:");
        double precio = entrada.nextDouble();
        System.out.println("Ingrese el numero de unidades vendidas:");
        int unidades = entrada.nextInt();

        Cerveza cerveza = new Cerveza(precio, unidades, tipo, nombre);
        String presentacionFactura = cerveza.presentar();
        System.out.println(presentacionFactura);

    }
}
