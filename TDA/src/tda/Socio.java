package tda;

public class Socio {

    // Atributos del Socio
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private int cantTorneos;
    private double puntaje;

    // Metodos constructores
    
    public Socio(int codigo, String nombre, String apellido, int edad, int cantTorneos, double puntaje) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantTorneos = cantTorneos;
        this.puntaje = puntaje;
    }

    public Socio(int codigo) {
        this.codigo = codigo;
    }

    // Metodos observadores
    
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantTorneos() {
        return cantTorneos;
    }

    public double getPuntaje() {
        return puntaje;
    }

    // Metodos modificadores
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantTorneos(int cantTorneos) {
        this.cantTorneos = cantTorneos;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    // Metodos comparativos
    
    public boolean equals(Socio s) {
        return this.codigo == s.codigo;
    }

    // Metodos propios del tipo
    
}
