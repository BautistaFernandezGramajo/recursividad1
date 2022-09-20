
package tda;


public class TestFecga {

    public static void main(String args[]) {
        Fecha fec1 = new Fecha(10,3,2003);
        Fecha fec2 = new Fecha(17,9,2022);
        int DifDias = fec1.diasTranscurridos(fec2);
        System.out.println("Edad: " + DifDias);
    }
}
