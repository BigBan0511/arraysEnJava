package pruebaarraybidimensionales;

public class Ejercicio5 {
    
    public static String matrizCharComoString(char [][] miMatriz){
        String cadena = "";
        for (int x = 0; x < miMatriz.length; x++) {
            for (int y = 0; y < miMatriz[x].length; y++) {
                cadena = cadena + miMatriz[x][y];
            }
        }
        return cadena;
    }

    public static void main(String[] args) {
        char [][] matriz = new char [3][3];
        matriz[0][0] = 'h';
        matriz[0][1] = 'o';
        matriz[0][2] = 'l';
        matriz[1][0] = 'a';
        matriz[1][1] = 'a';
        matriz[1][2] = 'a';
        String cadena1;
        cadena1 = matrizCharComoString(matriz);
        System.out.println(cadena1);
    }
    
}
