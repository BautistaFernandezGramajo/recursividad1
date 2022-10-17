package tprecursividad;

public class TPRecursividad {

    public static void main(String[] args) {
        //1
        System.out.println(func(3) +""+ func2(3));
    }

    public static int func(int n) {
//precondición: n es un entero positivo
        int aux;
        if (n == 0) {
            aux = 0;
        } else {
            aux = n + func(n - 1);
        }
        return aux;
    }
    
    public static int func2(int n){
    int aux=0;
        for (int i = 0; i <= n; i++) {
            aux = aux + i;
        }
    return aux;    
    }
}
