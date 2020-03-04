package herenciaVolumen;
import java.util.Scanner;
import java.util.SortedMap;

public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variables
        String nombre;
        String mensaje = "";
        double arista, volumenCubo;
        double radioCilindro, alturaCilindro, volumenCilindro;
        double radioCono, alturaCono, volumenCono;
        double radioEsf, volumenEsf;

        System.out.println("CALCULAR VOLUMEN");
        System.out.println("Ingrese la figura: (cubo, cilindro, cono, esfera):" );
        nombre = entrada.nextLine();
        nombre = nombre.toLowerCase(); // hacer minusculas

        entrada.nextLine();

        switch (nombre){
            case "cubo":
                System.out.println("Ingrese arista del cubo: ");
                arista = entrada.nextDouble();

                Cubo cubo = new Cubo(arista);
                cubo.setNombre(nombre);
                volumenCubo = cubo.calcularVolumenCubo();

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nArista: %.1f\nVOLUMEN: %.2f",
                        nombre, arista, volumenCubo);
                break;

            case "cilindro":
                System.out.println("Ingrese el radio del cilindro: ");
                radioCilindro = entrada.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                alturaCilindro = entrada.nextDouble();

                Cilindro cilindro = new Cilindro(radioCilindro, alturaCilindro);
                cilindro.setNombre(nombre);
                volumenCilindro = cilindro.calcularVolumenCilindro();

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio: %.1f\nAltura: %.1f\nVOLUMEN: " +
                        "%.2f",  nombre, radioCilindro, alturaCilindro, volumenCilindro);
                break;

            case "cono":
                System.out.println("Ingrese el radio del cono: ");
                radioCono = entrada.nextDouble();
                System.out.println("Ingrese la altura del cono: ");
                alturaCono = entrada.nextDouble();

                Cono cono = new Cono(radioCono, alturaCono);
                cono.setNombre(nombre);
                volumenCono = cono.calcularVolumenCono();

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio: %.1f\nAltura: %.1f\nVOLUMEN: " +
                        "%.2f",  nombre, radioCono, alturaCono, volumenCono);
                break;

            case "esfera":
                System.out.println("Ingrese el radio de la esfera: ");
                radioEsf = entrada.nextDouble();

                Esfera esfera = new Esfera(radioEsf);
                esfera.setNombre(nombre);
                volumenEsf = esfera.calcularVolumenEsfera();

                mensaje = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio Esfera: %.1f\nVOLUMEN: %.2f",
                        nombre, radioEsf, volumenEsf);
                break;

            default:
                mensaje = String.format("La opcion no es correcta");
        }
        System.out.println(mensaje);
    }
}
