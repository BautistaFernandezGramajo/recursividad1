package tprecursividadextra;

public class ej1 {

    public static void main(String args[]) {
    }

    /*
    a) Retornar verdadero si dentro del número existen dos dígitos seguidos
    consecutivos: (luego del 9 iría el 0)
     */
    public static boolean seguido(int num) {
        // Caso base 1. Si no hay mas numeros 2. Si encuentra dos consecutivos.
        // Paso recursivo. Evaluo de a dos digitos, desde el final del numero hasta el principio.
        int n1 = num % 10;
        int n2 = (num / 10) % 10;
        if (num / 10 > 0) {
            if (!consecutivos(n1, n2)) { // Si no detecta digitos consecutivos, prosigue con el paso recursivo
                return seguido(num / 10); // Paso recursivo. Divido el numero en 10 para seguir evaluando los digitos 
            } else {
                return true; // Caso base 2. Si hay dos numeros consecutivos retorna verdadero
            }
        } else {
            return false; // Caso base 1. Si no hay mas numeros que evaluar (es decir num/10 <= 0)
        }
    }

    public static boolean consecutivos(int n1, int n2) {
        boolean consecutivos = false;
        if (n1 - n2 == 1 || ((n1 == 0) && (n2 == 9))) { // Segun las condiciones del ejercicio, estos serian los casos en que dos digitos se consideran consecutivos.
            consecutivos = true;
        }
        return consecutivos;
    }
}
