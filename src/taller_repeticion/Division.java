package taller_repeticion;

public class Division {
    /*
        Integrantes:
            Edgar Guamo
            David Morales
     */
    private int num1;
    private int num2;
    private int resultado ;

    public Division(int resultado, int num2){
        this.setResultado(resultado);
        this.setNum2(num2);
    }

    public int obtenerResultado(){
        int cont = 1;
        int divisor = getResultado() / getNum2();
        while (cont < getNum2()){
            setResultado(getResultado() - divisor);
            cont = cont + 1;
        }

        return getResultado();
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
