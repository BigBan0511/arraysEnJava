package arrays;

import java.util.Scanner;

public class Arrays9 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        
        System.out.println("Introduce el tamaño del array");
        
        int [] miArray=new int [datos.nextInt()];
        
        System.out.println("Introduce los valores del array");
        
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("valor " +x);
            miArray [x]=datos.nextInt();
        }
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
        }
        
        int cambio= 0;
        for (int x = 0; x < miArray.length-1; x++) {
            cambio=miArray[x];
            for (int y = x+1; y < miArray.length; y++) {
                if (miArray[x]>miArray[y]) {
                    miArray[x]=miArray[y];
                    miArray[y]=cambio;
                }
            }
        }
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
        }
    }
    
}
