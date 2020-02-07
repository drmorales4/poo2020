package taller1;

public class EjecutaCelular {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setMarca("HUAWEI");
        celular.setModelo("Y6 2018");
        celular.setPulgadas(7);
        celular.setPeso(200);
        celular.setColor("Azul");

        String presentacion = celular.ejecutarCelular();
        System.out.println(presentacion);
    }
}
