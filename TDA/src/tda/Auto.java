package tda;

public class Auto {

    // Atributos
    private String patente;
    private String nombreDuenio;
    private int telefono;
    private String servicio;

    // Constructores
    public Auto(String patente) {
        this.patente = patente;
    }

    public Auto(String patente, String nombreDuenio, int telefono, String servicio) {
        this.patente = patente;
        this.nombreDuenio = nombreDuenio;
        this.telefono = telefono;
        this.servicio = servicio;
    }

    // Observadores
    public String getPatente() {
        return patente;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getServicio() {
        return servicio;
    }

    public String toString(){
        return "\n Patente: " + patente + "\n Dueño: " + "\n Telefono: " + telefono + " \n Servicio contratado: " + servicio ;
    }
    
    // Modificadores
    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    // Comparativas 
    
    public boolean equals(Auto a) {
        return patente.equals(a.patente);
    }
    
    // Propias del tipo
    

}
