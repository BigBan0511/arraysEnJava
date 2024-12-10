package ejerciciosdearrays;

import java.util.Scanner;

public class Ejercicio7VariablesIntercambio {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el tam del array:");
        int [] elArray=new int[datos.nextInt()];
        for(int x=0; x<elArray.length;x++){
            System.out.println("Introduce el elemento del array");
            elArray[x]=datos.nextInt();
        }
        //La idea es tener dos variables, en una guardo el elemento 
        //por el que voy cambiar y en otra el elemento actual
        if(elArray.length>1){
            //Si el tamaño es 1 no debo intercambiar nada
            int actual=elArray[1];
            int cambio=elArray[0];
            for(int x=1; x<elArray.length-1; x++){
                //Intercambiamos posiciones intermdias
                elArray[x]=cambio;
                cambio=actual;
                actual=elArray[x+1];
            }
            
            elArray[elArray.length-1]=cambio;
            elArray[0]=actual;
        }
        for(int x=0; x<elArray.length; x++)
            System.out.println(elArray[x]);
    }

}
