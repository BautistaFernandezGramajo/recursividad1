package tprecursividad;

import java.util.Scanner;

public class ej10 {

    public static void main(String args[]) {
        System.out.println(secuenciaCaracteres());
    }
    /*
    10. Diseñar e implementar un algoritmo recursivo que lea una secuencia de caracteres hasta que
    se ingrese el punto y retorne una frase formada por los caracteres en el orden leído.
    */
    
    public static String secuenciaCaracteres(){
       Scanner sc = new Scanner(System.in);
       System.out.println("ingrese un caracter");
       char carac = sc.next().charAt(0);
       if(carac=='.'){
            return ".";
       } else {
            return carac + secuenciaCaracteres();
       }
    }
}
