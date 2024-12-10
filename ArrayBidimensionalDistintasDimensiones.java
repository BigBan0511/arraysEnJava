package pruebaarraybidimensionales;

public class ArrayBidimensionalDistintasDimensiones {

    public static void main(String[] args) {
        //Vamos a ver como realizar un array bidimensional con x!=y
        int [][] miMatriz = new int [3][4];
        miMatriz[0][0]=0;
        miMatriz[0][1]=1;
        miMatriz[0][2]=2;
        miMatriz[0][3]=3;
        miMatriz[1][0]=4;
        miMatriz[1][1]=5;
        miMatriz[1][2]=6;
        miMatriz[1][3]=7;
        miMatriz[2][0]=8;
        miMatriz[2][1]=9;
        miMatriz[2][2]=10;
        miMatriz[2][3]=11;
        System.out.println("El tamaño de la primera dimensión de la matriz es: " + miMatriz.length);
        System.out.println("El tamaño de la segunda dimensión de la matriz es: " + miMatriz[0].length);
        /*for (int x = 0; x < miMatriz.length; x++) {
            //Estamos rercorriendo las "filas"
            for (int y = 0; y < miMatriz[x].length; y++) {
                //miMatriz[x].length me da el tamaño del array que hay dentro de cada posición de la x
                System.out.print(miMatriz[x][y] + "  ");
            }System.out.println();
        }*/
        for (int x = 0; x < miMatriz[0].length; x++) {
            //Las y tomarán valores de 0,1,2,3
            for (int y = 0; y < miMatriz.length; y++) {
                System.out.print(miMatriz[y][x] + " ");
            }System.out.println();
        }
    }
    
}
