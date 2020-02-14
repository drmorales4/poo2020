package taller_repeticion;
import java.util.Scanner;
public class EjecutaCajero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese Saldo Inicial");
        double saldoInicial = teclado.nextInt();
        double valor= 0;
        String controlador;
        boolean bandera = true;
        int opcion;

        Cajero cajero = new Cajero();

        cajero.setNombre(nombre);
        cajero.setSaldoIncial(saldoInicial);
        while(bandera){
            System.out.println("Por favor seleccione una opción: \n1. Retiro: \n2. Deposito: \n3. Consulta: ");
            opcion = teclado.nextInt();
            if (opcion == 1 || opcion==2){
                System.out.println("Ingrese el valor");
                valor = teclado.nextInt();
                cajero.setValor(valor);
            }
            cajero.setOpcion(opcion);
            cajero.calcularSaldo();
            System.out.println("\nSi desea realizar otra operacion digite s caso contrario digite n");
            teclado.nextLine();
            controlador = teclado.nextLine();
            if (controlador.equals("n")){
                bandera = false;
            }
        }
        System.out.println("\nNombre: "+nombre+"\nSaldo Final: "+cajero.getSaldoIncial());
    }
}
