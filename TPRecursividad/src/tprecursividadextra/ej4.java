/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tprecursividadextra;

/**
 *
 * @author ITProactive
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        piramideA(4, '*');
    }

    public static void piramideA(int n, char c) {
        if (n == 1) {
            System.out.print(c);
        } else {
            for (int i = n; i>=n; i++) {
                System.out.print(c);
            }
            System.out.println("");
            piramideB(n - 1, c);
        }
    }

    public static void piramideB(int n, char c) {
        if (n == 1) {
            System.out.print(c);
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.print(c);
            }
            System.out.println("");
            piramideB(n - 1, c);
        }
    }
}
