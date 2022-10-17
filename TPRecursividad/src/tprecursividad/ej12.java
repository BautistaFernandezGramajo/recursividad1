package tprecursividad;

public class ej12 {

    public static void main(String args[]) {
        char[] arrcar = {'h','o','l','a'};
        System.out.println(seEncuentra(arrcar,'1',arrcar.length-1));
    }

    /*
    12. Diseñar e implementar un algoritmo recursivo que dado un arreglo de caracteres y un caracter
    indique si se encuentra el caracter en el arreglo dado
     */
    public static boolean seEncuentra(char[] arr, char carac, int i) {
        if (i == 0 && arr[i] != carac) {
            return false;
        } else if (i == 0 && arr[i] == carac) {
            return true;
        } else if (arr[i] == carac) {
            return true;
        } else {
            return seEncuentra(arr, carac, i - 1);
        }
    }
}
