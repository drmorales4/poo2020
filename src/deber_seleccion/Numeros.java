package deber_seleccion;

public class Numeros {
    private int numero1;
    private int numero2;
    private int numero3;
    private int numero4;
    private int mayor;

    /**
     *  Construcctor
     * @param numero1
     * @param numero2
     * @param numero3
     * @param numero4
     */
    public Numeros(int numero1, int numero2, int numero3, int numero4){
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
    }

    /**
     *  Metodo para calcular el numero mayor
     * @return mayor
     */
    public int calcularNumMayor(){
        if (numero1 > numero2 && numero1 > numero3 && numero1 >  numero4){
            mayor = numero1;
        }else{
            if (numero2 > numero3 && numero2 > numero4){
                mayor = numero2;
            }else{
                if (numero3 > numero4){
                    mayor = numero3;
                } else {
                    mayor = numero4;
                }
            }
        }
        return mayor;
    }

    /**
     *  Metodo para imprimir en pantalla el numero mayor
     * @return cadena
     */
    public String sacarNumeroMayor(){
        String cadena = "";
        cadena = String.format("\nEl numero mayor es: %d", calcularNumMayor());
        return cadena;
    }

}
