package ejerciciosdearrays;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        //PASO 1: Solicito el tam del array
        System.out.println("Introduce el valor del array");
        int tam=datos.nextInt();
        char [] arrayChar=new char[tam];
        //PASO 2: Rellenarlo de char, para eso usamos un bucle con
        //datos.next().charAtIndex(índice)
        for(int x=0; x<arrayChar.length;x++){
            System.out.println("Introduce el valor en la pos " + x);
            arrayChar[x]=datos.next().charAt(0);
        }//PASO 3: Solicito el caracter de búsqueda
        System.out.println("Introduce el caracter a buscar:");
        char elCaracter=datos.next().charAt(0);
        //Creo un contador para ver el nº de veces que aparece el caracter
        int aparaciones=0;
        for(int x=0; x<arrayChar.length;x++){
            //PASO4: Recorro el array en busca de el caracter, si este aparece
            //incremento el contador
            if(elCaracter==arrayChar[x]){
                aparaciones++;
            }//PASO 5: Muestro el valor del contador
        }System.out.println("El caracter " + elCaracter + " ha aparecido " +
                aparaciones + " veces en el array");
    }
    
}
