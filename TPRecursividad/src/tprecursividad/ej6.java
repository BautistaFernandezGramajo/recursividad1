package tprecursividad;

public class ej6 {

    public static void main(String args[]) {
        int[] arr = {200, 1, 5, 2 , 6 , 3 ,4,100};
        System.out.println(mayorNum(arr, 0));
    }

    /*
    6. Diseñar e implementar un algoritmo recursivo para obtener el número mayor de un arreglo
    numérico.
     */
    public static int mayorNum(int[] arr, int i) {
        if (i == arr.length - 2) {
            return arr[arr.length-1]; // Caso Base
        } else {
            if(arr[i]>mayorNum(arr,i+1)){ // Si el elemento en la posicion i es mayor que
                return arr[i];
            } else {
                return mayorNum(arr, i+1);
            }
        }
    }
}
