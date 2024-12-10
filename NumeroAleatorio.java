package arrays;

public class NumeroAleatorio {

    public static void main(String[] args) {
        System.out.println(Math.random()*7);
        System.out.println("---------------------------------------------------");
        //EJEMPLO DE CASTING (CASTEO, CONVERSIÓN DE TIPOS)
        //Forzar a una variable de un tipo determinado a que se convierta
        //en una variable de otro tipo
        double numDoub=3.5;
        //Si intentamos guardar dentro de una variable entera un valor de tipo
        //double, java llora -> ESTO NO SE PUEDE HACER
        //La solución es hacer un casteo varNew=(nuevo tipo de dato)varVieja
        int numInt=(int)numDoub;
        System.out.println("Valor en double: " + numDoub);
        System.out.println("Valor en int: " + numInt);
        
        //Cuando tenemos que indicar el casteo entre paréntesis, es llamado
        //explícito
        
        int num=66;
        char car=(char)num;
        System.out.println("Como numero: " +num);
        System.out.println("Como char: " +car);
        
        char caracter=97;
        int numero=(int)caracter;
        System.out.println("Como caracter: " +caracter);
        System.out.println("Como numero: " +numero);
        
        //Java puede realizar conversiones implicitas en ciertos casos, es decir
        //no tengo que hacer nada para que convierta. Pasar de char a int es
        //"Gratis"
        
        char car2='*';
        int num2=car2;
        System.out.println(num2);
        
        //No podemos castear lo que queramos, sino que hay variables que son
        //incompatibles entre si
        int numCadena=4;
        String miCadena="Hola soy una cadena de caracteres";
        System.out.println(miCadena);
        // ESTE CASTEO NO SE PUEDE-> int numCadena=(int)miCadena;
        //ESTE TAMPOCO-> miCadena=(String)numCadena;
        char cadenita='p';
        //ESTE TAMPOCO-> miCadena=(String)cadenita;
        System.out.println("---------------------------------------------------");
        System.out.println("numero aleatorio: " + Math.random());
        //Para crear nº aleatorios y hacer operaciones matemáticas
        //usamos la clase Math, que tiene muchas funciones
        //en concreto la función random() que devuelve un nº aleatorio
        //double, entre 0 y 1 (nunca 0, nunca 1)
        System.out.println("---------------------------------------------------");
        //Para hacer que el nº aleatorio llegue más lejo , lo multiplicamos
        //por el límite superior al que queremos llegar, ejemplo entre 0 y 7
        //para que no sean decimales casteamos la operación entera con 
        //(int)(Math.random()*x)
        System.out.println((int)(Math.random()*8));
        System.out.println("---------------------------------------------------");
        //Si queremos que este último llegue al 8 hacemos lo siguiente:
        System.out.println((int)(Math.random()*8+1));
    }
    
}
