package datos_tipo_objeto;
import java.util.ArrayList;
import java.util.List;

public class EjemploLista {
    public static void main(String[] args) {
        // creacion de una lista en java
        // para almacenar valores de tipo String

        List<String> universidades = new ArrayList<String>();
        universidades.add("UTPL");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("ESPOL");
        System.out.println("Tamaño de la lista: "+universidades.size());
        universidades.add("UNL");
        System.out.println("Tamaño de la lista: "+universidades.size());

        // eliminacion del elemento en la posicion 1
        universidades.remove(1);
        System.out.println("Tamaño de la lista: "+universidades.size());

        // remplazamos valores de una posicion indicada de nuetra lista
        universidades.set(1, "UIDE");

        // agregamos un nuevo valor en una posicion intermdia
        universidades.add(1, "UNL");
        // recorremos lista para presentar valores
        /*
        for (int i=0; i < universidades.size(); i++){
            System.out.println(universidades.get(i));
        }
         */
        for (String univ: universidades){
            System.out.println(univ);
        }

    }
}
