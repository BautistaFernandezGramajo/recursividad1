
package tprecursividad;

public class ej9 {

 
    public static void main(String args[]) {
        
    }
    /*
    Diseñar e implementar un algoritmo recursivo que dados dos números (divisor y dividendo)
    realice la división por restas sucesivas.
    */
    public static int div(int divisor, int dividendo){
        if(divisor/dividendo<dividendo){
            return divisor/dividendo;
        } else {
            return 1 + div(divisor-dividendo,dividendo);
        }
    }
}
