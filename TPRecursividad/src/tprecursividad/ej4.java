package tprecursividad;

public class ej4 {

    public static void main(String args[]) {
        System.out.println(sonIguales(1112));
    }

    /*4. Diseñar e implementar un algoritmo recursivo para verificar si todos los dígitos de un número
        son iguales (por ejemplo si el número es 111 debe retornar true, si el número es 12111 debe
        retornar false).*/
    public static boolean sonIguales(int nro) {
        int n1 = nro % 10;
        int n2 = (nro / 10) % 10;
        if (nro / 10 <= 0) {
            return true;
        } else if (n1 != n2) {
            return false;
        } else {
            return sonIguales(nro / 10);
        }
    }
}
