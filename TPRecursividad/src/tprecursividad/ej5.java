package tprecursividad;

import java.util.Scanner;

public class ej5 {

    public static void main(String args[]) {
        System.out.println(cuantosDigitos());;
    }

    /*
    5. Diseñar e implementar un algoritmo recursivo que lea una secuencia de dígitos (en cada llamada
    recursiva debe leer un número) y cuente cuántos son múltiplos de 3 hasta que se ingrese el valor
    0.
     */
    
    public static int cuantosDigitos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nro:");
        int aux = sc.nextInt();
        if(aux==0){
            return aux;
        } else {
            if(aux%3==0){
                return 1 + cuantosDigitos();
            } else {
                return 0 + cuantosDigitos();
            }
        }
    }
    
}
