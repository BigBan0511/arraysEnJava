
import java.util.Scanner;


public class Ejercicio8 {

   
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int [] array1= {1, 2, 3, 4, 3};
        int array2 []=new int[array1.length];
        //Pedimos el caracter de búsqueda
        System.out.println("Introduce un nº para cambiar por 0s");
        int buscado=datos.nextInt();
        //Recorremos el array1 en busca del caracter, si lo encontramos
        //guardamos en esa posición del array2 un 0 y sino guardamos
        //lo que hay en el array1 en esa posición.
        for(int x=0; x<array1.length;x++){
            if(array1[x]==buscado){
                array2[x]=0;
            }else{
                array2[x]=array1[x];
            }
        }//MOSTRAMOS EL ARRAY 2
        for(int x=0; x<array2.length;x++){
            System.out.println(array2[x]);
        }
    }

}
