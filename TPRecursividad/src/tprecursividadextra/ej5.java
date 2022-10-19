/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tprecursividadextra;

/**
 *
 * @author ITProactive
 */
public class ej5 {

    public static void main(String args[]) {
        System.out.println(mensaje(5));
    }
    
    // Inciso A
    // La idea detrás del ejercicio es que si el numero es impar aplique la formula x*3+1, y si es par x/2. Esta logica llevara siempre al mismo caso base, que es el numero 1.
    
    
    // Inciso B
    public static int mensaje(int x){
        if(x==1){
            return 1;
        } else {
            if(x%2==0){
                return x/2 + mensaje(x/2);
            } else {
                return (x*3+1)+ mensaje(x*3+1);
            }
        }
    }
    
}
