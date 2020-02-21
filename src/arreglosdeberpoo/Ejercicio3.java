package arreglosdeberpoo;

public class Ejercicio3 {
    private String cedula;
    private int[] numero = new int[10];
    private int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
    private int[] resulado = new int[9];
    private int suma;
    private String mensaje = "";

    /*
        Metodo construcctor
     */
    public Ejercicio3 (String cedula){
        this.cedula = cedula;
    }
    /*
        Metodo para pasar a un arreglo el numero de cedula
     */
    public int[] arreglarCedula(){
        for(int i=0; i < cedula.length(); i++){
            numero[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return numero;
    }
    /*
        Metodo para multiplicar los coeficientes por los primeros 9 numeros de la cedula
     */
    public int[] sacarResultado(){
        for (int j=0; j < coeficientes.length; j ++){
            if ((coeficientes[j] * arreglarCedula()[j]) >= 10){
                resulado[j] = (coeficientes[j] * arreglarCedula()[j]) - 9;
            }else{
                resulado[j] = coeficientes[j] * arreglarCedula()[j];
            }
        }
        return resulado;
    }
    /*
     Metodo para sumar todos los resulados
     */
    public int sacarSuma(){
        suma = 0;
        for (int k=0; k < sacarResultado().length; k ++){
            suma = suma + sacarResultado()[k];
        }
        return suma;
    }
    /*
         Metodo para sacar la decena superior
     */
    public int calcularDecena(){
        int calcular;
        calcular = sacarSuma()/10;
        calcular = (calcular + 1) * 10;
        return calcular;
    }

    /*
        Metodo para restar la decena superior y la suma de todos los resultados
     */
    public int restar(){
        int num;
        if (sacarSuma() == 10){
            num = 0;
        }else {
            num = calcularDecena() - sacarSuma();
        }
        return num;
    }
    /*
        Metodo para comparar y enviar el mensaje correspondiente
     */
    public String comparar(){
        if (restar() == arreglarCedula()[9]){
            mensaje = "\nEl número de cédula es correcto";
        }else{
            if (restar() != arreglarCedula()[9]){
                mensaje = "\nCédula incorrecta";
            }
        }
        return mensaje;
    }


}
