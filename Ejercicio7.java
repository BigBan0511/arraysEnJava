package ejerciciosdearrays;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        System.out.println("Introduce el tam del array:");
        int [] elArray=new int[datos.nextInt()];
        for(int x=0; x<elArray.length;x++){
            System.out.println("Introduce el elemento del array");
            elArray[x]=datos.nextInt();
        }
        //Guarda el último elemento
        int ultimoElemento=elArray[elArray.length-1];
        //Recorre a la inversa y hace todos los intercambios menos el del
        //elemto 0 que lo deja para el final
        for(int x=elArray.length-1; x>0;x--){
            elArray[x]=elArray[x-1];
        }
        //Hace el último intercambio
        elArray[0]=ultimoElemento;
        for(int x=0; x<elArray.length;x++)
            System.out.print(elArray[x]);
    }

}
