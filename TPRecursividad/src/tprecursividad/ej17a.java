package tprecursividad;
public class ej17a {
    public static void main(String args[]) {
        System.out.print(pir(3));
    }
    public static String pir(int n){
        if(n==1){
           return Integer.toString(n);
        } else {
           return Integer.toString(n) + pir(n-1);
        }
        
    } 
    
}
