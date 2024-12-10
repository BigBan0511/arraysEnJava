package arrays;

import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce la longitud de un array");
        int [] miArray=new int[datos.nextInt()];
        System.out.println("La longitud del array es: "+miArray.length );
        System.out.println("introduce los valores del array: ");
        for (int x = 0; x < miArray.length; x++) {
         miArray [x] =datos.nextInt();  
        }
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("El valor de la " +x + " posicion es: " +miArray[x]);
        }
    }
    
}
