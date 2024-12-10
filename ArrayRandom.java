package arrays;

import java.util.Scanner;

public class ArrayRandom {

    public static void main(String[] args) {
        //Para rellenar arrays normalmente utilizamos for
        Scanner datos=new Scanner (System.in);
        int [] miArray=new int [5];
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("Introduce la posición " + x + " del array");
            miArray[x]=datos.nextInt();
        }
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("Elemento " + (x+1) + ": " + miArray[x]);
            
        }
    }
    
}
