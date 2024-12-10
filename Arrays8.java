package arrays;

import java.util.Scanner;

public class Arrays8 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce el tamaño del array");
        int [] miArray=new int [datos.nextInt()];
        System.out.println("Introduce los valores del array");
        for (int x = 0; x < miArray.length; x++) {
            System.out.println("valor " +x);
            miArray [x]=datos.nextInt();
        }
        System.out.println("introduce un valor a buscar en el array");
        int numeroBuscar=datos.nextInt();
        
        int apariciones=0;
        for (int x = 0; x < miArray.length; x++) {
            if (numeroBuscar==miArray[x]) {
                apariciones++;
            }
        }
        System.out.println("El caracter " + numeroBuscar + " ha aparecido "
        + apariciones + " veces en el array");
        for (int x = 0; x < miArray.length; x++) {
            System.out.println(miArray[x]);
            
        }
        System.out.println("El array con el numero elegido sustituido por 0 es: ");
        int [] miArrayCero= new int [miArray.length];
        for (int x = 0; x < miArrayCero.length; x++) {
            if (miArray[x]==numeroBuscar){
                 miArrayCero[x]=0; 
            }else{
                miArrayCero[x]=miArray[x];
            }
        }
        for (int x = 0; x < miArrayCero.length; x++) {
            System.out.println(miArrayCero[x]);
            
        }
        
    }
    
}
