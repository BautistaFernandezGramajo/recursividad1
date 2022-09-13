package tda;

/**
 * Desarrollo de Algoritmos - 2022
 *
 * @author Fernandez Gramajo Bautista
 */
public class Avion {

    private int identificador;
    private String modelo;
    private int cantAsientos;
    private double km;
    private double velPromedio;

    public Avion(int identificador, String modelo, int cantAsientos, double km, double velPromedio) {
        this.identificador = identificador;
        this.modelo = modelo;
        this.cantAsientos = cantAsientos;
        this.km = km;
        this.velPromedio = velPromedio;
    }

    // Metodos observadores
    public int getIdentificador() {
        return identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public double getKm() {
        return km;
    }

    public double getVelPromedio() {
        return velPromedio;
    }

    public String toString() {
        return "\n ID: " + identificador + "\n Modelo: " + modelo + "\n Cantidad de Asientos: " + cantAsientos + "\n km recorridos: " + km + "\n Velocidad Promedio:" + velPromedio;
    }

    // Metodos Modificadores

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setVelPromedio(double velPromedio) {
        this.velPromedio = velPromedio;
    }
    
    
}
