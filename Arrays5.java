package arrays;

import java.util.Scanner;

public class Arrays5 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        //Paso 1: solicito el tamaño del array
        System.out.println("Introduce el tamaño del array: ");
        int tam=datos.nextInt();
        char [] miArrayChar=new char[tam];
        
        //Paso 2: rellenarlo de char, para eso usamos un bucle con
        
        //datos.next().charAtIndex(Indice)
        
        System.out.println("Introduce los datos del array: ");
        
        for (char x = 0; x < miArrayChar.length; x++) {
            System.out.println("Introduce el valor en la pos " +x);
            miArrayChar [x]=datos.next().charAt(0);
        }
        //Paso 3: solicito el caracter de comparación
        
        System.out.println("Introduce el caracter a buscar: ");
        char elCaracter=datos.next().charAt(0);
        
        //creo un contador para ver el nº de veces que aparece el caracter
        
        int apariciones=0;
        for (int x = 0; x < miArrayChar.length; x++) {
            //Paso 4: recorro el array en busca del caracter, si este aparece
            //incremento el contador
            if(elCaracter==miArrayChar[x]) {
                apariciones++;
            }
        }//Paso 5: muestro el valor del contador
        
        System.out.println("El caracter " + elCaracter + " ha aparecido "
        + apariciones + " veces en el array");
        
        
    }
    
}
