package tda;

public class Terreno {

    // Atributos
    private int codigo;
    private double base;
    private double altura;
    private int manzana;

    // Metodos Constructores
    // Nro 1.
    public Terreno(int cod) {
        base = 0;
        altura = 0;
    }

    // Constructor con todos los parametros
    public Terreno(int cod, double ba, double al, int man) {
        codigo = cod;
        base = ba;
        altura = al;
        manzana = man;
    }

    // Observadores
    public int getCodigo() {
        return codigo;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public int getManzana() {
        return manzana;
    }

    public String toString() {
        return codigo + " " + base + " " + altura + " " + manzana;
    }

    public boolean equals(Terreno otroTerreno) {
        return (codigo == otroTerreno.getCodigo());
    }

    // Modificadores
    public void setCodigo(int cod) {
        codigo = cod;
    }

    public void setBase(double ba) {
        base = ba;
    }

    public void setAltura(double al) {
        altura = al;
    }

    // Propias del Tipo
    public double perimetro() {
        return 2 * base + 2 * altura;
    }

    public double superficie() {
        return base * altura;
    }

    public double precio(double precio) {
        return precio * this.superficie();
    }

}
