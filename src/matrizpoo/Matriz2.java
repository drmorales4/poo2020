    /*
     * Taller Grupal
     * Integrantes:
     * Diana Serrano
     * David Morales
     * Nohelia Ludeña
     * Shomira Rosales*/
package matrizpoo;

    public class Matriz2 {
        private int f ;
        private int c;
        private int matriz[][] = new int[f][c]  ;
        private int suma;
        private double  promedio;

        /**
         * Metodo para sumar dos matrices en una tercera matriz
         */
        public void sumaMatriz(){
            suma = 0;
            for(int i = 0; i< f; i++){
                for(int j = 0; j< c; j++){
                    suma +=  matriz[i][j];
                }

            }
        }
        public void promedio(){
            promedio = suma /(f + c);
        }
        /**
         * Metodo para imprimir una matriz
         */
        public void presentarMatriz (int[][] matriz){
            for(int i=0; i< f;i++){
                for(int j= 0; j<c ; j++){
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println( );
            }
        }
        /**
         * Metodo para obtener el valor de matriz
         * @return matrizA
         */
        public int[][] getMatriz() {
            return matriz;
        }
        /**
         * Metodo para actualizar la matriz matrizA
         * @param matriz
         */
        public void setMatriz(int[][] matriz) {
            this.matriz = matriz;
        }

        public int getF() {
            return f;
        }

        public void setF(int f) {
            this.f = f;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public int getSuma() {
            return suma;
        }

        public void setSuma(int suma) {
            this.suma = suma;
        }

        public double getPromedio() {
            return promedio;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }
    }