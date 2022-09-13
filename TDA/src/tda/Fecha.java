package tda;

/**
 * Desarrollo de Algoritmos - 2022
 *
 * @author Fernandez Gramajo Bautista
 */
public class Fecha {

    private int d;
    private int m;
    private int a;

    public Fecha(int d, int m, int a){
        verificarDia(d);
        this.d = d;
        verificarMes();
        this.m = m;
        this.a = a;
    }
    
    private void verificarDia(int d){
    
    }

    // Metodos Observadores
    public int getDia() {
        return d;
    }

    public int getMes() {
        return m;
    }

    public int getAño() {
        return a;
    }

    public String ToString() {
        return "\n Dia: " + d + "\n Mes: " + m + "\n Año: " + a;
    }

    // Metodos modificadores
    public void setDia(int d) {
        this.d = d;
    }

    public void setMes(int m) {
        this.m = m;
    }

    public void setAño(int a) {
        this.a = a;
    }
    
    // Propias del tipo
    
    public int diasTranscurridos(){
    return d+m*31;
    }
    
}
