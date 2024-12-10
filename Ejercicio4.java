package pruebaarraybidimensionales;

public class Ejercicio4 {
    
    public static void mostrarMatrizId(int[][] miMatriz){
        for (int x = 0; x < miMatriz[0].length; x++) {
            for (int y = 0; y < miMatriz.length; y++) {
                System.out.print(miMatriz[y][x] + " ");
            }System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int [2][4];
        mostrarMatrizId(matriz);
    }
    
}
