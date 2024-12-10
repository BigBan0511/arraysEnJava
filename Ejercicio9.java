package ejerciciosdearrays;

import java.util.Scanner;


public class Ejercicio9 {

   
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el tam del array");
        int [] miArray=new int [datos.nextInt()];
        for(int x=0; x<miArray.length;x++){
            System.out.println("Introduce el valor de el array");
            miArray[x]=datos.nextInt();
        }
        //Vamos a ordenar
        for(int x=0; x<=miArray.length-2;x++){
            for(int y=x+1;y<=miArray.length-1;y++){
                //La y siempre empieza su bucle en la siguiente posición
                //a la x, como voy fijando la posición de la x en cada vuelta
                //siempre que itera la x entera coloco un nº
                if(miArray[x]>miArray[y]){
                    //Si esto pasa intercambiamos
                    int aux=miArray[x];
                    miArray[x]=miArray[y];
                    miArray[y]=aux;
                }
            }
        }for(int x=0; x<miArray.length;x++){
            System.out.print(miArray[x] + " ");
        }
    }

}
