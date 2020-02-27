package herencia;

import java.util.Date;
import java.util.Scanner;

public class EjecutaPersonal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String identificacion;
        String estado_civil;
        String fecha_Nacimiento;
        String carrera;
        String area;
        String dependencia;

        // creacion de objeto de la clase estudiante
        Estudiante estudiante = new Estudiante();
        System.out.println("CREACION DE OBJETO ESTUDIANTE");
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la identificacion:");
        identificacion = entrada.nextLine();
        System.out.println("Ingrese la carrera:");
        carrera = entrada.nextLine();
        System.out.println("Ingrese estado civil:");
        estado_civil = entrada.nextLine();
        System.out.println("Ingrese la fecha de nacimiento:");
        fecha_Nacimiento = entrada.nextLine();

        estudiante.setNombre(nombre);
        estudiante.setIdentificacion(identificacion);
        estudiante.setCarrera(carrera);
        estudiante.setEstado_civil(estado_civil);
        estudiante.setFecha_Nacimiento(fecha_Nacimiento);

        System.out.println("\nDatos de objeto estudiante");
        System.out.println("Nombre: "+estudiante.getNombre());
        System.out.println("Identificacion: "+estudiante.getIdentificacion());
        System.out.println("Carrera: "+estudiante.getCarrera());
        System.out.println("Estado civil: "+estudiante.getEstado_civil());
        System.out.println("Fecha de nacimiento: "+estudiante.getFecha_Nacimiento());


        // Creacion de objeto de la clase Docente
        Docente docente = new Docente();
        System.out.println("\n\nCREACION DE OBJETO DOCENTE");
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = entrada.nextLine();
        System.out.println("Ingrese el area al que pertenece: ");
        area = entrada.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = entrada.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_Nacimiento = entrada.nextLine();

        docente.setNombre(nombre);
        docente.setIdentificacion(identificacion);
        docente.setArea(area);
        docente.setEstado_civil(estado_civil);
        docente.setFecha_Nacimiento(fecha_Nacimiento);

        System.out.println("\nDatos de objetos docente");
        System.out.println("Nombre: " +docente.getNombre());
        System.out.println("Identificacion: " +docente.getIdentificacion());
        System.out.println("Area: " +docente.getArea());
        System.out.println("Estado Civil: " +docente.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +docente.getFecha_Nacimiento());


        // Creacion de objeto de la clase Administrativo
        Administrativo administrativo = new Administrativo();
        System.out.println("\n\nCREACION DE OBJETO ADMINISTRATIVO");
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la identificacion: ");
        identificacion = entrada.nextLine();
        System.out.println("Ingrese dependencia: ");
        dependencia = entrada.nextLine();
        System.out.println("Ingrese estado civil: ");
        estado_civil = entrada.nextLine();
        System.out.println("Ingrese fecha de nacimiento: ");
        fecha_Nacimiento = entrada.nextLine();

        administrativo.setNombre(nombre);
        administrativo.setIdentificacion(identificacion);
        administrativo.setDependencia(dependencia);
        administrativo.setEstado_civil(estado_civil);
        administrativo.setFecha_Nacimiento(fecha_Nacimiento);

        System.out.println("\nDatos de objetos administrtivo");
        System.out.println("Nombre: " +administrativo.getNombre());
        System.out.println("Identificacion: " +administrativo.getIdentificacion());
        System.out.println("Dependencia: " +administrativo.getDependencia());
        System.out.println("Estado Civil: " +administrativo.getEstado_civil());
        System.out.println("Fecha de nacimiento: " +administrativo.getFecha_Nacimiento());


    }
}
