package pruebaarraybidimensionales;

public class Ejercicio3 {
    
    public static int[][] obtenerMatrizIDentidad(int val){
        int [][] miMatriz = new int [val][val];
        for (int x = 0; x < miMatriz.length; x++) {
            for (int y = 0; y < miMatriz[x].length; y++) {
                if(x==y){
                    miMatriz[x][y] = 1;
                }else{
                    miMatriz[x][y] = 0;
                }
            }
        }
        return miMatriz;
    }

    public static void main(String[] args) {
        int [][] matrizID;
        matrizID = obtenerMatrizIDentidad(5);
        for (int x = 0; x < matrizID.length; x++) {
            for (int y = 0; y < matrizID[x].length; y++) {
                System.out.print(matrizID[x][y] + " ");
            }System.out.println("");
        }
    }
    
}
