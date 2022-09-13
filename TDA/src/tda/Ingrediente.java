package tda;

/**
 * Desarrollo de Algoritmos - 2022
 *
 * @author Fernandez Gramajo Bautista
 */
public class Ingrediente {

    private String nombre;
    private double cantidad;
    private String unidad;

    // Metodos constructores
    public Ingrediente(String nn, double cant, String un) {
        nombre = nn;
        cantidad = cant;
        unidad = un;
    }

    // Metodos observadores;
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public String toString() {
        return "Nombre: " + nombre + "\n Cantidad: " + cantidad + "\n Unidad: " + unidad;
    }

    // Metodos modificadores
    public void setNombre(String nn) {
        nombre = nn;
    }

    public void setCantidad(double cant) {
        cantidad = cant;
    }

    public void setUnidad(String un) {
        unidad = un;
    }
}
