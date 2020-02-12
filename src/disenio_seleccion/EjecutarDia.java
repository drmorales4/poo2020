package disenio_seleccion;
import java.util.Scanner;
public class EjecutarDia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 7");
        int numero = entrada.nextInt();

        Dia dia = new Dia();
        dia.setNumero(numero);
        String presentacion = dia.presentar();
        System.out.println(presentacion);

    }
}
