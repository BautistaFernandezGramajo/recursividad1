/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tprecursividadextra;

/**
 *
 * @author Bautista
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(totalPares(arr, 4));
    }

    /*
    Dado un arreglo de enteros retorne:
    la cantidad de elementos pares si la suma de los elementos da par
    la cantidad de impares si la suma da impar.
     */
    public static int totalPares(int[] arr, int i) {
        if (i == 0) {
            return arr[i];
        } else {
            return arr[i]
    }

}
