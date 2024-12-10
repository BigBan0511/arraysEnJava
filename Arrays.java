package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        /*Caracteristicas de un arrray:
        -Un conjunto de variables con la misma naturaleza
        es decir, el mismo tipo de dato asociado a un solo identificador 
        (nombre de variable). Todos int, o todos char,
        o todos boolean... (NO SE PUEDE MEZCLAR)
        
        -Hay que asignarles un tamaño y una vez hecho esto 
        "NO SE PUEDE CAMBIAR"
        
        -El primer elemento del array es el [0] y el último será [tamaño-1]*/
        //DECLARACIÓN DE ARRAY:
        //Si conocemos los elementos que tiene
        int [] primerArray={4,5,9};
        //Para acceder a los datos del array uso su índice
        System.out.println("Elemento 1 del array: " +primerArray[0]);
        System.out.println("Elemento 2 del array: " +primerArray[1]);
        System.out.println("Elemento 3 del array: " +primerArray[2]);
        //CUIDADO -> System.out.println("Elemento 4 del array: " +primerArray[3]);
        System.out.println("---------------------------------------------------");
        //Otra forma cuando conozco los elementos pero no los meto en el array
        //cuando declaro el array, sino después
        char [] miArrayDeChar=new char[5];
        System.out.println("Elemento 1 del array: " +miArrayDeChar[0]);
        System.out.println("Elemento 2 del array: " +miArrayDeChar[1]);
        System.out.println("Elemento 3 del array: " +miArrayDeChar[2]);
        System.out.println("Elemento 4 del array: " +miArrayDeChar[3]);
        System.out.println("Elemento 5 del array: " +miArrayDeChar[4]);
        //Todo sale vacío porque aún no he introducido elementos en el array
        //Para introducir elementos pongo su identificador y el índice donde
        //quiero guardar el elemento entre cochetes, seguido de = valor
        miArrayDeChar [0]='a';
        miArrayDeChar [1]='w';
        miArrayDeChar [2]='e';
        miArrayDeChar [3]='b';
        miArrayDeChar [4]='o';
        System.out.println("---------------------------------------------------");
        System.out.println("Elemento 1 del array: " +miArrayDeChar[0]);
        System.out.println("Elemento 2 del array: " +miArrayDeChar[1]);
        System.out.println("Elemento 3 del array: " +miArrayDeChar[2]);
        System.out.println("Elemento 4 del array: " +miArrayDeChar[3]);
        System.out.println("Elemento 5 del array: " +miArrayDeChar[4]);
        System.out.println(":" + miArrayDeChar [0] +  miArrayDeChar [1] + miArrayDeChar [2] + miArrayDeChar [3] + miArrayDeChar [4] );
        System.out.println("---------------------------------------------------");
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce las notas de 5 alumnos: ");
        int [] notas=new int[5];
        System.out.println("Introduce la nota del 1º alumno: ");
        notas[0]=datos.nextInt();
        System.out.println("Introduce la nota del 2º alumno: ");
        notas[1]=datos.nextInt();
        System.out.println("Introduce la nota del 3º alumno: ");
        notas[2]=datos.nextInt();
        System.out.println("Introduce la nota del 4º alumno: ");
        notas[3]=datos.nextInt();
        System.out.println("Introduce la nota del 5º alumno: ");
        notas[4]=datos.nextInt();
        System.out.println("---------------------------------------------------");
        System.out.println("La nota del 1º alumno es: "+ notas[0]);
        System.out.println("La nota del 2º alumno es: "+ notas[1]);
        System.out.println("La nota del 3º alumno es: "+ notas[2]);
        System.out.println("La nota del 4º alumno es: "+ notas[3]);
        System.out.println("La nota del 5º alumno es: "+ notas[4]);
        //Yo puedo saber que tamaño tiene un array llamando 
        //a su propiedad length
        System.out.println("El total de notas introducidas es: " + notas.length);
        System.out.println("---------------------------------------------------");
        
    }
    
}
