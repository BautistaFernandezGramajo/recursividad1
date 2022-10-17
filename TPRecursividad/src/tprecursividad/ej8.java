/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tprecursividad;

/**
 *
 * @author Bautista
 */
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(oracionPalindromo(""));
    }

    /*
    8. Diseñar e implementar un algoritmo recursivo que retorne true si una oración es un palíndromo.
    Un palíndromo es una oración capicúa (no se contabiliza las mayúsculas y minúsculas ni los
    espacios en blanco): 
     */
    public static boolean oracionPalindromo(String oracion) {
        if (oracion.equals("") || oracion.length()==1) {
            return true;
        } else if(oracion.charAt(0)!=oracion.charAt(oracion.length()-1)){
            return false;
        }
        return oracionPalindromo(oracion.substring(1,oracion.length()-1));
    }
}
