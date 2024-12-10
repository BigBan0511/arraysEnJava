package arrays;

import java.util.Scanner;

public class Arrays6 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int tam=datos.nextInt();
        char [] miArrayChar=new char[tam];
        
        System.out.println("Introduce los datos del array: ");
        
        for (char x = 0; x < miArrayChar.length; x++) {
            System.out.println("Introduce el valor en la pos " +x);
            miArrayChar [x]=datos.next().charAt(0);
        }
        
        System.out.println("Introduce el caracter a buscar: ");
        char elCaracter=datos.next().charAt(0);
        
        int apariciones=0;
        for (int x = 0; x < miArrayChar.length; x++) {
            if(elCaracter==miArrayChar[x]) {
                apariciones++;
            }
        }
        
        for (int x = 0; x < miArrayChar.length; x++) {
            System.out.println(miArrayChar[x]);
        }
        
        System.out.println("El caracter " + elCaracter + " ha aparecido "
        + apariciones + " veces en el array");
        
        
        System.out.println("introduce un caracter de sustitucion");
        char sustitucion=datos.next().charAt(0);
        for (int x = 0; x < miArrayChar.length; x++) {
            if (elCaracter==miArrayChar[x]) {
                elCaracter=sustitucion;
                miArrayChar[x]=sustitucion;
            }
        }
        System.out.println("El caracter sustituido es:  " +elCaracter);
        
        for (int x = 0; x < miArrayChar.length; x++) {
            System.out.println(miArrayChar[x]);
            
        }
    }
    
}
