
package ejerciciosdearrays;

public class Ejercicio3 {

    public static void main(String[] args) {
        int [] miArray={3,6,7,12,4,7,8,5,9,12};
        System.out.println("Mostrar en orden:");
        for(int x=0; x<miArray.length; x++)
            System.out.println(miArray[x]);
        System.out.println("Mostrar en orden inverso:");
        for(int x=miArray.length-1; x>=0; x--)
            System.out.println(miArray[x]);
        
        /*int valor=miArray[3];
        System.out.println(valor);*/
    }
    
}
