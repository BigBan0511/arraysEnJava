package arrays;

import java.util.Scanner;

public class EjemploArrayFor {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("De cuantos alumnos necesitas introducir la nota?");
        int notas []=new int[datos.nextInt()];
        for (int x = 0; x < notas.length; x++) {
            System.out.println("Introduce la nota del alumno " + (x+1) + ":");
            notas[x] =datos.nextInt();
        }
        for (int x = 0; x < notas.length; x++) {
            System.out.println("La nota del alumno " + (x+1) + " es " +notas[x]);
        }
    }   
}
