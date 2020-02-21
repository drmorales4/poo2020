package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaEjercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cedula="";
        String mensaje;

        // ciclo while para ingresar el numero de cedula que siempre tiene 10 digitos
        while (cedula.length() != 10){
            System.out.println("Ingrese el numero de cedula:");
            cedula = entrada.nextLine();
            if (cedula.length() != 10){
                System.out.println("Cedula incorrecta, ingrese nuevamente.");
            }
        }

        // creamos objeto
        Ejercicio3 ejercicio3 = new Ejercicio3(cedula);
        mensaje = ejercicio3.comparar(); // llamamos al metodo del mensaje
        System.out.println(mensaje); // imprimir en pantalla


    }
}
