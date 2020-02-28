package herenciafigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // variables
        String nombre;
        String cadena = "";
        double baseTrian, alturaTrian, areaTrian;
        double baseRec, alturaRec, areaRec;
        double lados, areaCua;
        double radio, areaCir;

        System.out.println("CALCULO DE AREAS");
        System.out.println("Ingrese el nombre de la figura: ");
        nombre = entrada.nextLine();
        nombre = nombre.toLowerCase(); // hago minusculas toda la cadena

        if (nombre.equals("triangulo")){
            entrada.nextLine();
            System.out.println("Ingrese la base del triangulo:");
            baseTrian = entrada.nextDouble();
            System.out.println("Ingrese altura del triangulo:");
            alturaTrian = entrada.nextDouble();

            Triangulo triangulo = new Triangulo(baseTrian, alturaTrian);
            triangulo.setNombre(nombre);
            areaTrian = triangulo.calcularAreaTriangulo();

            cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nBase: %.1f\nAltura: %.1f\nAREA: %.2f",
                    nombre, baseTrian, alturaTrian, areaTrian);
        }else {
            if (nombre.equals("rectangulo")){
                entrada.nextLine();
                System.out.println("Ingrese la base del Rectangulo:");
                baseRec = entrada.nextDouble();
                System.out.println("Ingrese altura del Rectangulo:");
                alturaRec = entrada.nextDouble();

                Rectangulo rectangulo = new Rectangulo(baseRec, alturaRec);
                rectangulo.setNombre(nombre);
                areaRec = rectangulo.calcularAreaRectangulo();

                cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nBase: %.1f\nAltura: %.1f\nAREA: %.2f",
                        nombre, baseRec, alturaRec, areaRec);
            }else {
                if (nombre.equals("cuadrado")){
                    entrada.nextLine();
                    System.out.println("Ingrese el valor de los lados del Cuadrado:");
                    lados = entrada.nextDouble();

                    Cuadrado cuadrado = new Cuadrado(lados);
                    cuadrado.setNombre(nombre);
                    areaCua = cuadrado.calcularAreaCuadrado();

                    cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nLados: %.1f\nAREA: %.2f",
                            nombre, lados, areaCua);
                }else {
                    if (nombre.equals("circulo") || nombre.equals("círculo")){
                        entrada.nextLine();
                        System.out.println("Ingrese el radio del círculo: ");
                        radio = entrada.nextDouble();

                        Circulo circulo = new Circulo(radio);
                        circulo.setNombre(nombre);
                        areaCir = circulo.calcularAreaCirculo();

                        cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio: %.1f\nAREA: %.2f",
                                nombre, radio, areaCir);
                    }else {
                        cadena = String.format("Esa figura no esta para calcular");
                    }
                }
            }
        }
        System.out.println(cadena); // imprimir cadena
    }
}
