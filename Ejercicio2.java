package pruebaarraybidimensionales;

public class Ejercicio2 {
    
    public static int[][] rellenarMatrizSecuencia2D(int [][] miMatriz){
        int val = 0;
        for (int i = 0; i < miMatriz[0].length; i++) {
            for (int j = 0; j < miMatriz.length; j++) {
                miMatriz[j][i] = val++;
            }
        }
        return miMatriz;
    }

    public static void main(String[] args) {
        try {
            int [][] matriz = new int [5][5];
            matriz = rellenarMatrizSecuencia2D(matriz);
            for (int x = 0; x < matriz[0].length; x++) {
                for (int y = 0; y < matriz.length; y++) {
                    System.out.print(matriz[x][y] + " ");
                }System.out.println("");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Las dimensiones de la matriz se van fuera de los limites al introducir un valor");
        }
    }
    
}
