package datos_tipo_objeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        boolean bandera = true;

        do {
            System.out.println("\nDigite 1 para almecenar nuevo vehiculo a la lista");
            System.out.println("Digite 2 para presentar la lista");
            System.out.println("Digite 3 para salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion){
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.println("\nIngrese placa: ");
                    vehiculo.setPlaca(entrada.nextLine());
                    System.out.println("Ingrese marca: ");
                    vehiculo.setMarca(entrada.nextLine());
                    System.out.println("Ingrese modelo: ");
                    vehiculo.setModelo(entrada.nextLine());
                    System.out.println("Ingrese color: ");
                    vehiculo.setColor(entrada.nextLine());
                    entrada.nextLine();
                    System.out.println("Ingrese año: ");
                    vehiculo.setAnio(entrada.nextInt());
                    System.out.println("Ingrese cilindraje: ");
                    vehiculo.setCilindraje(entrada.nextInt());
                    entrada.nextLine();

                    // agregamos objeto vehiculo a la lista
                    vehiculos.add(vehiculo);
                    break;

                case 2:
                    // recorremos lista con foreach
                    // System.out.println("\nPlaca\tMarca\tCilindraje");
                    System.out.println("\nFICHAS DE VEHICULOS REGISTRADOS");
                    for (Vehiculo v: vehiculos){
                        System.out.println("\n----------------------");
                        System.out.println("Placa: "+v.getPlaca());
                        System.out.println("Marca: "+v.getMarca());
                        System.out.println("Modelo: "+v.getModelo());
                        System.out.println("Año: "+v.getCilindraje());
                        System.out.println("Color: "+v.getColor());
                        System.out.println("----------------------");
                        // System.out.println(v.getPlaca()+"\t"+v.getMarca()+"\t"+v.getCilindraje());
                    }
                    break;

                case 3:
                    bandera = false;
                    break;

                default:
                    System.out.println("\nOpcion Incorrecta");
            }
        }while (bandera);

    }
}
