package pruebaarraybidimensionales;

public class Ejercicio1 {
    
    public static int[][] rellenarMatrizSecuencia1D(int[][] miMatriz){
        int val = 0;
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                miMatriz[i][j] = val++;
            }
        }
        return miMatriz;
    }
    public static void main(String[] args) {
        int [][] matriz = new int [5][5];
        matriz = rellenarMatrizSecuencia1D(matriz);
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }System.out.println(" ");
        }
    }
    
}
