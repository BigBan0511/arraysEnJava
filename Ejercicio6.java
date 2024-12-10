package pruebaarraybidimensionales;

public class Ejercicio6 {
    
    public static char[][] rellenarMatrizAsteriscos(int numFilas) {
        // Calculamos el tamaño de la matriz basado en el número de filas
        int numColumnas = numFilas * 2 - 1;
        // Creamos una matriz para almacenar los asteriscos
        char[][] matriz = new char[numFilas][numColumnas];
        
        // Iteramos sobre cada fila
        for (int i = 0; i < numFilas; i++) {
            // Calculamos la posición central de la fila actual
            int centro = numColumnas / 2;
            // Calculamos cuántos asteriscos deben agregarse en esta fila
            int numAsteriscos = i * 2 + 1;
            
            // Llenamos la fila con asteriscos
            for (int j = 0; j < numColumnas; j++) {
                // Marcamos con asteriscos solo las posiciones correspondientes al centro y a los lados
                if (j >= centro - i && j <= centro + i) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = ' ';
                }
            }
        }
        return matriz;
    }
    
    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numFilas = 5;
        char[][] matriz = rellenarMatrizAsteriscos(numFilas);
        imprimirMatriz(matriz);
    }
    
}
