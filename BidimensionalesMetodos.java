package pruebaarraybidimensionales;

import java.util.Scanner;

public class BidimensionalesMetodos {
    public static Scanner datos = new Scanner (System.in);
    public static int x;
    public static int y;
    
    public static void pedirDimensiones(){
        System.out.println("Introduce la dimension x");
        x = datos.nextInt();
        System.out.println("Introduce la dimension y");
        y = datos.nextInt();
    }
    
    public static void rellenarMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce la siguiente posicion");
                matriz[i][j] = datos.nextInt();
            }
        }
    }
    
    public static void mostrarMatrizFilas(int [][] matrizMostrar){
        for (int z = 0; z < matrizMostrar.length; z++) {
            for (int j = 0; j < matrizMostrar[z].length; j++) {
                System.out.print(matrizMostrar[z][j] + " ");
            }System.out.println("");
        }
    }
    
    public static void mostrarMatrizColumnas(int [][] matrizMostrar){
        for (int i = 0; i < matrizMostrar[0].length; i++) {
            for (int j = 0; j < matrizMostrar.length; j++) {
                System.out.print(matrizMostrar[j][i] + " ");
            }System.out.println("");
        }
    }

    public static void main(String[] args) {
        pedirDimensiones();
        int [][] miMatriz = new int [x][y];
        rellenarMatriz(miMatriz);
        mostrarMatrizFilas(miMatriz);
        mostrarMatrizColumnas(miMatriz);
    }
    
}
