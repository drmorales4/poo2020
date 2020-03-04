package herenciaDeuda;
import java.util.Scanner;
public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String numeroCliente;
        String nombre;
        String numeroCuenta;
        double capital, tasaInteres;
        int plazo;
        double interes;
        boolean opcion = true;
        int tipoDeuda = 0;
        int contadorClientes = 0, seguirOp;
        String cadena = "";

        cadena = String.format("%s\nREPORTE DE CLIENTES DEUDORES\nNo. Cliente\t\t\tNombre\t\t\tNo. Cuenta\t\t\tInterés por pagar\n"
                , cadena);

        while (opcion == true){
            System.out.println("CALCULAR INTERES");
            boolean opcion2 = true;
            while (opcion2 == true){
                System.out.println("\nEscoja el tipo de Prestamo:\n( 1 ). Prestamo Personal.\n( 2 ). Prestamo " +
                        "Hipotecario.\n( 3 ). Prestamo Auto.");
                tipoDeuda = entrada.nextInt();

                if (tipoDeuda != 1 && tipoDeuda != 2 && tipoDeuda != 3){
                    System.out.println("Opcion Incorrecta, intente de nuevo");
                    opcion2 = true;
                }else {
                    opcion2 = false;
                }
            }

            entrada.nextLine();

            if (tipoDeuda == 1){
                System.out.println("Calcular el interes a pagar por Prestamo Personal.");
                System.out.println("Ingrese el numero de Cliente:");
                numeroCliente = entrada.nextLine();
                System.out.println("Ingrese el nombre del Cliente:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el numero de la Cuenta:");
                numeroCuenta = entrada.nextLine();
                System.out.println("Ingrese el capital Prestado:");
                capital = entrada.nextDouble();
                System.out.println("Ingrese la tasa de interes %:");
                tasaInteres = entrada.nextDouble();
                System.out.println("Ingrese plazo en numero de meses del Prestamo");
                plazo = entrada.nextInt();

                PrestamoPersonal prestamoPersonal = new PrestamoPersonal(capital, tasaInteres, plazo);
                prestamoPersonal.setNumeroCliente(numeroCliente);
                prestamoPersonal.setNombreCliente(nombre);
                prestamoPersonal.setNumeroCuenta(numeroCuenta);
                interes = prestamoPersonal.calcularInteres();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, numeroCliente, nombre, numeroCuenta, interes);
            }
            if (tipoDeuda == 2){
                System.out.println("Calcular el interes a pagar por Prestamo Hipotecario.");
                System.out.println("Ingrese el numero de Cliente:");
                numeroCliente = entrada.nextLine();
                System.out.println("Ingrese el nombre del Cliente:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el numero de la Cuenta:");
                numeroCuenta = entrada.nextLine();
                System.out.println("Ingrese el capital Prestado:");
                capital = entrada.nextDouble();
                System.out.println("Ingrese la tasa de interes %:");
                tasaInteres = entrada.nextDouble();
                System.out.println("Ingrese plazo en numero de meses del Prestamo");
                plazo = entrada.nextInt();

                PrestamoHipotecario prestamoHipotecario = new PrestamoHipotecario(capital, tasaInteres, plazo);
                prestamoHipotecario.setNumeroCliente(numeroCliente);
                prestamoHipotecario.setNombreCliente(nombre);
                prestamoHipotecario.setNumeroCuenta(numeroCuenta);
                interes = prestamoHipotecario.calcularInteres();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, numeroCliente, nombre, numeroCuenta, interes);
            }
            if (tipoDeuda == 3){
                System.out.println("Calcular el interes a pagar por Prestamo Auto.");
                System.out.println("Ingrese el numero de Cliente:");
                numeroCliente = entrada.nextLine();
                System.out.println("Ingrese el nombre del Cliente:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el numero de la Cuenta:");
                numeroCuenta = entrada.nextLine();
                System.out.println("Ingrese el capital Prestado:");
                capital = entrada.nextDouble();
                System.out.println("Ingrese la tasa de interes %:");
                tasaInteres = entrada.nextDouble();
                System.out.println("Ingrese plazo en numero de meses del Prestamo");
                plazo = entrada.nextInt();

                PrestamoAuto prestamoAuto = new PrestamoAuto(capital, tasaInteres, plazo);
                prestamoAuto.setNumeroCliente(numeroCliente);
                prestamoAuto.setNombreCliente(nombre);
                prestamoAuto.setNumeroCuenta(numeroCuenta);
                interes = prestamoAuto.calcularInteres();

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
