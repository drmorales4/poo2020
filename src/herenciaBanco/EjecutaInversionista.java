package herenciaBanco;
import java.util.Scanner;
public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variables
        String numeroCliente;
        String nombre;
        String numeroCuenta;
        double capital, tasaInteres;
        int plazo;
        double interes;
        boolean opcion = true;
        int tipoCuenta = 0;
        int contadorClientes = 0, seguirOp;
        String cadena = "";

        cadena = String.format("%s\nREPORTE DE INVERSIONES\nNo. Cliente\t\t\tNombre\t\t\tNo. Cuenta\t\t\tInterés ganado\n"
                , cadena);

        while (opcion == true){
            System.out.println("CALCULAR INTERES");
            boolean opcion2 = true;
            while (opcion2 == true){
                System.out.println("\nEscoja el tipo de Cuenta:\n( 1 ). Cuenta de Ahorros.\n( 2 ). Pagare.\n( 3 ). " +
                        "Cuenta Maestra.");
                tipoCuenta = entrada.nextInt();

                if (tipoCuenta != 1 && tipoCuenta != 2 && tipoCuenta != 3){
                    System.out.println("Opcion Incorrecta, intente de nuevo");
                    opcion2 = true;
                }else {
                    opcion2 = false;
                }
            }
            entrada.nextLine();

            if (tipoCuenta == 1){
                System.out.println("Calcular el interes de Cuenta de Ahorros.");
                System.out.println("Ingrese el numero de Cliente:");
                numeroCliente = entrada.nextLine();
                System.out.println("Ingrese el nombre del Cliente:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el numero de la Cuenta:");
                numeroCuenta = entrada.nextLine();
                System.out.println("Ingrese el capital actual en la cuenta:");
                capital = entrada.nextDouble();
                System.out.println("Ingrese la tasa de interes anual en %:");
                tasaInteres = entrada.nextDouble();
                System.out.println("Ingrese plazo en numero de meses (1 - 12) ");
                plazo = entrada.nextInt();

                CuentaAhorro cuentaAhorro = new CuentaAhorro(capital, tasaInteres, plazo);
                cuentaAhorro.setNumeroCliente(numeroCliente);
                cuentaAhorro.setNombreCliente(nombre);
                cuentaAhorro.setNumeroCuenta(numeroCuenta);

                interes = cuentaAhorro.obtenerIntereses();
                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, numeroCliente, nombre, numeroCuenta, interes);
            }
            if (tipoCuenta == 2){
                System.out.println("Calcular el interes Pagare.");
                System.out.println("Ingrese el numero de Cliente:");
                numeroCliente = entrada.nextLine();
                System.out.println("Ingrese el nombre del Cliente:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el numero de la Cuenta:");
                numeroCuenta = entrada.nextLine();
                System.out.println("Ingrese el capital actual:");
                capital = entrada.nextDouble();
                System.out.println("Ingrese la tasa de interes anual en %:");
                tasaInteres = entrada.nextDouble();
                System.out.println("Ingrese plazo en numero de dias:");
                plazo = entrada.nextInt();

                Pagare pagare = new Pagare(capital, tasaInteres, plazo);
                pagare.setNumeroCliente(numeroCliente);
                pagare.setNombreCliente(nombre);
                pagare.setNumeroCuenta(numeroCuenta);
                interes = pagare.obtenerInteres();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, numeroCliente, nombre, numeroCuenta, interes);
            }
            if (tipoCuenta == 3){
                System.out.println("Calcular el interes de una Cuenta Maestra.");
                System.out.println("Ingrese el numero de Cliente:");
                numeroCliente = entrada.nextLine();
                System.out.println("Ingrese el nombre del Cliente:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el numero de la Cuenta:");
                numeroCuenta = entrada.nextLine();
                System.out.println("Ingrese el capital actual:");
                capital = entrada.nextDouble();
                System.out.println("Ingrese la tasa de interes anual en %:");
                tasaInteres = entrada.nextDouble();
                System.out.println("Ingrese plazo en numero de dias:");
                plazo = entrada.nextInt();

                CuentaMaestra cuentaMaestra = new CuentaMaestra(capital, tasaInteres, plazo);
                cuentaMaestra.setNumeroCliente(numeroCliente);
                cuentaMaestra.setNombreCliente(nombre);
                cuentaMaestra.setNumeroCuenta(numeroCuenta);
                interes = cuentaMaestra.obtenerInteres();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, numeroCliente, nombre, numeroCuenta, interes);
            }

            entrada.nextLine();

            boolean seguir = true;
            while (seguir == true){
                System.out.println("Desea seguir ingresando datos de clientes? Digite el numero:\n1) Si\n2) No");
                seguirOp = entrada.nextInt();
                if (seguirOp == 1){
                    opcion = true;
                    seguir = false;
                }else {
                    if (seguirOp == 2){
                        opcion = false;
                        seguir = false;
                    }else {
                        if (seguirOp != 1 && seguirOp != 2){
                            System.out.println("Opcion incorrecta, ingrese nuevamente");
                            seguir = true;
                        }
                    }
                }
            }
            contadorClientes = contadorClientes + 1;
        }
        cadena = String.format("%s\nTOTAL %d CLIENTES\n", cadena, contadorClientes);
        System.out.println(cadena);
    }
}
