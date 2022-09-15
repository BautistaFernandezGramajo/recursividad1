package tda;

public class Producto {

    // Atributos
    private int codigo;
    private String descripcion;
    private double precio;
    private double stock;

    // Metodos constructores
    public Producto(int codigo) {
        this.codigo = codigo;
    }

    public Producto(int codigo, String descripcion, double precio, double stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    // Metodos observadores
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getStock() {
        return stock;
    }

    public String toString() {
        return "\n Codigo: " + codigo + "\n Descripcion: " + descripcion + "\n Precio ($/kg) " + precio + "\n Stock disponible: " + stock;
    }

    // Metodos Modificadores
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    // Metodos Comparativos
    public boolean equals(Producto p) {
        return codigo == p.getCodigo();
    }

    // Metodos propios del tipo
    // a
    public double calcularCosto(double cantidad) {
        return cantidad * precio;
    }

    // b
    public void restarStock(double cantStock) {
        stock = stock - cantStock;
    }

}
