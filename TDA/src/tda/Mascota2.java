package tda;

public class Mascota2 {

    private int codigo;
    private String nombre;
    private double peso;
    private int edad;

    public Mascota2(int cod) {
        codigo = cod;
        nombre = "";
        peso = 0;
        edad = 0;
    }

    public Mascota2(int cod, String nn, double pe, int ed) {
        codigo = cod;
        nombre = nn;
        peso = pe;
        edad = ed;
    }
    
    //  Metodos observadores
    
    public int getCodigo(){
    return codigo;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public double getPeso(){
    return peso;
    }
    
    public int getEdad(){
    return edad;
    }
    
    public String toString() {
        return "\n Codigo: " + codigo + "\n Nombre: " + nombre + "\n Peso: " + peso + "\n Edad: " + edad;
    }
    
    // Metodos Modificadores
    
    public void setCodigo(int cod){
     codigo = cod;
    }
    
    public void setNombre(String nn){
     nombre = nn;
    }
    
    public void setPeso(double pe) {
     peso = pe;
    }
    
    public void setEdad(int ed) {
     edad = ed;
    }
    
    // Propios del tipo
    public boolean equals(Mascota2 otraMascota){
        return (codigo == otraMascota.getCodigo());
    }
    
}
