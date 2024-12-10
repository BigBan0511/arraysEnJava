package pruebaarraybidimensionales;

public class PruebaArrayBidimensionales {

    public static void main(String[] args) {
        //Para crear un array bidimensional es necesario generar dos dimensiones
        int [][] miMatriz = new int [2][2];
        //Rellenamos la matriz elemento a elemento
        miMatriz[0][0] = 1;
        miMatriz[0][1] = 2;
        miMatriz[1][0] = 3;
        miMatriz[1][1] = 4;
        //Si queremos imprimir un elemento del array concreto, accedemos a sus índices
        System.out.println("Elemento (0,1)= " + miMatriz[0][1]);
        //Podemos recorrer el array bidimensional utilizando bucles anidados
        for (int x = 0; x < miMatriz.length; x++) {
            //En este momento estamos recorriendo las x que representan las "filas"
            for (int y = 0; y < miMatriz.length; y++) {
                //Imprimimos el elemento intersección entre filas y columnas
                System.out.print(miMatriz[x][y]);
            }//Hacemos el salto de línea una vez hemos recorrido la fila entera
            System.out.println();
        }
    }
    
}
