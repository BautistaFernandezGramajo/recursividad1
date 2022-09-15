package tda;

public class TestSocio {

    public static void main(String args[]) {
        Socio s1, s2;
        int cod;
        s1 = new Socio(1, "Pepe", "Argento", 50, 3, 100);
        s2 = new Socio(2, "Juan", "Argento", 50, 3, 100);
        if (s1.getCantTorneos() > s2.getCantTorneos()) {
            cod = s1.getCodigo();
        } else {
            cod = s2.getCodigo();
        }
        System.out.print("El socio que ha ganado mas torneos es: " + cod);
        
        

    }
}
