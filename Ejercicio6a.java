package ejerciciosdearrays;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Esta variable controla la catidad de veces
        //que sustituimos
        int sustituciones=0;
        //PASO1: Creamo el array
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        char [] miArrayChar=new char[datos.nextInt()];
        //PASO 2: Rellenamos el array
        for(int x=0; x<miArrayChar.length;x++){
            System.out.println("Introduce el caracter:");
            miArrayChar[x]=datos.next().charAt(0);
        }//PASO 3: Solicitamos los caracteres de buscqueda
        //y sustitución
        System.out.println("¿Qué caracter deseas sustituir?");
        char buscado=datos.next().charAt(0);
        System.out.println("Dime el caracter de sustitución:");
        char sustituto=datos.next().charAt(0);
        //PASO 4: Recorremos el array y susutituimos los valores
        for(int x=0; x<miArrayChar.length;x++){
           if(miArrayChar[x]==buscado){
               sustituciones++;
               miArrayChar[x]=sustituto;
           } 
        //PASO 5: Mostramos el array
        }
        for(int x=0; x<miArrayChar.length;x++)
            System.out.print(miArrayChar[x] + "   ");
        System.out.println();
        System.out.println("Hemos hecho " + sustituciones
        + " sustituciones");
    }
}
