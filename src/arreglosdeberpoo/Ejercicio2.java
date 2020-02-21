package arreglosdeberpoo;
import java.lang.Math;
public class Ejercicio2 {
    private String binario;
    private int resultado;
    /*
        Metodo construcctor
     */
    public Ejercicio2 (String binario){
        this.binario = binario;
    }
    /*
        Metodo para pasar a un arreglo el numero binario
     */
    public int[] convertir(){
        int[] nums = new int[binario.length()];
        for(int i=0; i < binario.length(); i++){
            nums[i] = Character.getNumericValue(binario.charAt(i));
        }
        return nums;
    }
    /*
        Metodo para convertir a decimal
     */
    public int convertirBinario(){
        int elevado;
        for (int j=0; j < convertir().length; j ++){
            elevado = (int) Math.pow(2, j);
            resultado = resultado + (convertir()[j] * elevado);
        }
        return resultado;
    }

}
