package arrays;

import java.util.Scanner;

public class Arrays4 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        int valorMax, valorMin, posMax, posMin;
        int [] miArray=new int[10];
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("Introduce el elemento " + (x+1) + " de");
            miArray[x]=datos.nextInt();
        }//ASPOTAMOS A QUE LA POSICIÓN 0 DEL ARRAY ES EL MAX, ES EL MI
        //Y LUEGO SI NO LO ES LO CAMBIAMOS.
        valorMax=miArray[0];
        valorMin=miArray[0];
        posMax=0;
        posMin=0;
        //Puedo empezar en el 1 el for porque valor[0] no puede ser
        //ni mas pequeño ni mas grande que él mismo.
        for (int x = 1; x < miArray.length; x++) {
            //Vamos a comparar los valores max y min con cada posición
            //del array. Buscamos un nuevo min
            if (miArray[x]<valorMin) {
                valorMin=miArray[x];
                posMin=x;
            }//Buscamos los max de la misma forma
            if(miArray[x]>valorMax) {
                valorMax=miArray[x];
                posMax=x;
            }
        }
        System.out.println("El valor maximo es: " +valorMax);
        System.out.println("Y su posicion es: " +posMax);
        System.out.println("El valor minimo es: " +valorMin);
        System.out.println("Y su posicion es: " +posMin);
    }
    
}
