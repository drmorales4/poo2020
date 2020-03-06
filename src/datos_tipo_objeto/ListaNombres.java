package datos_tipo_objeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> nombres = new ArrayList<String>();
        boolean seguir = true;
        int opcion = 0;
        String lista;

        while (seguir == true){

            System.out.println("\nMenu:");
            System.out.println("1. Agregar nuevo nombre");
            System.out.println("2. Presentar lista de nombres");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();

            entrada.nextLine();

            if (opcion == 1){
                System.out.println("\nAgregar nuevo nombre a la lista");
                lista = entrada.nextLine();
                nombres.add(lista);
                seguir = true;
            }
            if (opcion == 2){
                for (int i=0; i < nombres.size(); i++){
                    System.out.println(nombres.get(i));
                }
                seguir = true;
            }
            if (opcion == 3){
                seguir = false;
            }

            if (opcion != 1 && opcion != 2 && opcion != 3){
                System.out.println("\nOpcion incorreta. Ingrese nuevamente");
                seguir = true;
            }
        }
        System.out.println("\nFin del programa.");
    }
}
