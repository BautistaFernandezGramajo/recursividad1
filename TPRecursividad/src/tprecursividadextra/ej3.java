/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tprecursividadextra;

/**
 *
 * @author ITProactive
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.print(onda("HHHHLLLL"));
    }

    public static String onda(String s) {
        if (s.length() == 1) {
            if (s.charAt(0) == 'L') {
                return "_";
            } else {
                return "-";
            }
        } else {
            if (s.charAt(0) == 'L' && s.charAt(1)=='L') {
                return "_" + onda(s.substring(1));
            } else if (s.charAt(0)=='L' && s.charAt(1)=='H'){
                return "_" + "|" + onda(s.substring(1));
            } else if (s.charAt(0)=='H' && s.charAt(1)=='H') {
                return "-" + onda(s.substring(1));
            } else {
                return "-" + "|" + onda(s.substring(1));
            }
        }
    }
}
