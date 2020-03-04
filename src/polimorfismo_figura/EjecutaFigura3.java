package polimorfismo_figura;
import java.util.Scanner;
public class EjecutaFigura3 {
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

            Triangulo3 triangulo3 = new Triangulo3(baseTrian, alturaTrian, nombre);
            triangulo3.calcularArea();

            cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nBase: %.1f\nAltura: %.1f\nAREA: %.2f",
                    nombre, baseTrian, alturaTrian, triangulo3.getArea());
        }else {
            if (nombre.equals("rectangulo")){
                entrada.nextLine();
                System.out.println("Ingrese la base del Rectangulo:");
                baseRec = entrada.nextDouble();
                System.out.println("Ingrese altura del Rectangulo:");
                alturaRec = entrada.nextDouble();

                Rectangulo3 rectangulo3 = new Rectangulo3(baseRec, alturaRec, nombre);
                rectangulo3.calcularArea();

                cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nBase: %.1f\nAltura: %.1f\nAREA: %.2f",
                        nombre, baseRec, alturaRec, rectangulo3.getArea());
            }else {
                if (nombre.equals("cuadrado")){
                    entrada.nextLine();
                    System.out.println("Ingrese el valor de los lados del Cuadrado:");
                    lados = entrada.nextDouble();

                    Cuadrado3 cuadrado3 = new Cuadrado3(lados, nombre);
                    cuadrado3.calcularArea();

                    cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nLados: %.1f\nAREA: %.2f",
                            nombre, lados, cuadrado3.getArea());
                }else {
                    if (nombre.equals("circulo") || nombre.equals("círculo")){
                        entrada.nextLine();
                        System.out.println("Ingrese el radio del círculo: ");
                        radio = entrada.nextDouble();

                        Circulo3 circulo3 = new Circulo3(radio,nombre);
                        circulo3.calcularArea();

                        cadena = String.format("\n\nRESULTADO.\nNombre Figura: %s\nRadio: %.1f\nAREA: %.2f",
                                nombre, radio, circulo3.getArea());
                    }else {
                        cadena = String.format("Esa figura no esta para calcular");
                    }
                }
            }
        }
        System.out.println(cadena); // imprimir cadena
    }
}
