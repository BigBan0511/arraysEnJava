package arrays;

import java.util.Scanner;

public class Arrays7 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el tamaño del array");
        int miArray []=new int[datos.nextInt()];
        System.out.println("introduce los datos del array");
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("Introduce el valor en la pos " +x);
            miArray [x]=datos.nextInt();
        }
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
            
        }
        
        System.out.println("Los valores del array cambiados son los siguientes: ");
        int cambio=miArray[0];
        int previa=miArray[1];
        for (int x = 1; x < miArray.length; x++) {
            miArray[x]=cambio;
            cambio=previa;
            if (x<(miArray.length-1)){
            previa=miArray[x+1];  
            }else{
            }
            
        }
        miArray[0]=previa;
        
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
        }
    }
    
}
