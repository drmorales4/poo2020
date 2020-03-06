package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleadoA2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variables
        String rfc, nombre, departamento, puesto;
        double sueldoMensual, sueldoQ;
        double valorTrabajos;
        int veces;
        double salarioMin;
        int cantidad;
        boolean opcion = true;
        int tipoEmpleado = 0;
        int contadorEmpleados = 0;
        int seguirOp;
        String cadena = "";

        cadena = String.format("%s\nREPORTE DE NÓMINA QUINCENAL\nRFC\t\t\t NOMBRE\t\t\t \tDEPTO.\t\t\t \tPUESTO\t\t\t \tSUELDO QUINCENA\n"
                , cadena);

        while (opcion == true) {
            System.out.println("\nCALCULAR SUELDO QUINCENAL.");
            boolean opcion2 = true;
            while (opcion2 == true) {
                System.out.println("\nEscoja el tipo de empleado:\n( 1 ). Administrativos.\n( 2 ). Mecanicos.\n( 3 ). " +
                        "Vendedores.");
                tipoEmpleado = entrada.nextInt();
                if (tipoEmpleado != 1 && tipoEmpleado != 2 && tipoEmpleado != 3) {
                    System.out.println("Opcion Incorrecta, intente de nuevo");
                    opcion2 = true;
                } else {
                    opcion2 = false;
                }
            }
            entrada.nextLine();

            if (tipoEmpleado == 1) {
                System.out.println("Calcular Sueldo Quincenal Administrativos.");
                System.out.println("Ingrese el codigo RFC:");
                rfc = entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el departamento al que pertenece:");
                departamento = entrada.nextLine();
                System.out.println("Ingrese el puesto:");
                puesto = entrada.nextLine();
                System.out.println("Ingrese valor de el sueldo Mensual:");
                sueldoMensual = entrada.nextDouble();

                Administrativos2 administrativos2 = new Administrativos2(sueldoMensual, nombre);
                administrativos2.calcularSueldoQ();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, rfc, nombre, departamento, puesto, administrativos2.getSueldoQ());
            }

            if (tipoEmpleado == 2) {
                System.out.println("Calcular Sueldo Quicenal Mecanicos.");
                System.out.println("Ingrese el codigo RFC:");
                rfc = entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el departamento al que pertenece:");
                departamento = entrada.nextLine();
                System.out.println("Ingrese el puesto:");
                puesto = entrada.nextLine();
                System.out.println("Ingrese valor de los trabajos realizados:");
                valorTrabajos = entrada.nextDouble();
                System.out.println("Ingrese las veces de trabajos realiazdos:");
                veces = entrada.nextInt();

                Mecanicos2 mecanicos2 = new Mecanicos2(valorTrabajos, veces, nombre);
                mecanicos2.calcularSueldoQ();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, rfc, nombre, departamento, puesto, mecanicos2.getSueldoQ());
            }

            if (tipoEmpleado == 3) {
                System.out.println("Calcular Sueldo Quicenal Vendedores.");
                System.out.println("Ingrese el codigo RFC:");
                rfc = entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese el departamento al que pertenece:");
                departamento = entrada.nextLine();
                System.out.println("Ingrese el puesto:");
                puesto = entrada.nextLine();
                System.out.println("Ingrese la cantidad de autos vendidos:");
                cantidad = entrada.nextInt();
                entrada.nextLine();
                double[] precioAutos = new double[cantidad];
                for (int i = 0; i < cantidad; i++) {
                    System.out.printf("Ingrese el el valor del vehiculo vendido %d: ", i);
                    precioAutos[i] = entrada.nextDouble();
                }

                Vendedores2 vendedores2 = new Vendedores2(cantidad, precioAutos, nombre);
                vendedores2.calcularSueldoQ();

                cadena = String.format("%s%s\t\t\t %s\t\t\t %s\t\t\t %s\t\t\t %.2f\n", cadena, rfc, nombre, departamento, puesto, vendedores2.getSueldoQ());
            }

            entrada.nextLine();

            boolean seguir = true;
            while (seguir == true){
                System.out.println("Desea seguir ingresando datos de empleados? Digite el numero:\n1) Si\n2) No");
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
            contadorEmpleados = contadorEmpleados + 1;
        }
        cadena = String.format("%s\nTOTAL %d EMPLEADOS\n", cadena, contadorEmpleados);
        System.out.println(cadena);
    }
}
