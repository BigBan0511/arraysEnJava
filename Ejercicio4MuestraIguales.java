/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosdearrays;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ejercicio4MuestraIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int valorMax, valorMin, posMax, posMin;
        int [] miArray=new int[5];
        for(int x=0; x<miArray.length;x++){
            System.out.println("Introduce el elemento " + (x+1) + " del array");
            miArray[x]=datos.nextInt();
        }valorMax=miArray[0];
         valorMin=miArray[0];
         posMax=0;
         posMin=0;
         for(int x=1; x<miArray.length;x++){
             if(miArray[x]<valorMin){
                 valorMin=miArray[x];
                 posMin=x;
             }
             if(miArray[x]>valorMax){
                 valorMax=miArray[x];
                 posMax=x;
             }
         }System.out.println("El valor Max es: " + valorMax);
         //System.out.println("Y su posición es: " + posMax);
         System.out.println("El valor Min es: " + valorMin);
         //System.out.println("El su posición es: " + posMin);
         System.out.println("El valor max ha aparecido en las posiciones:");
         
         for(int x=0; x<miArray.length;x++){
             if(valorMax==miArray[x])
                 System.out.println(x);
        }
         System.out.println("El valor min ha aparecido en las posiciones:");
         for(int x=0; x<miArray.length;x++){
             if(valorMin==miArray[x])
                 System.out.println(x);
        }
    }
    
}
