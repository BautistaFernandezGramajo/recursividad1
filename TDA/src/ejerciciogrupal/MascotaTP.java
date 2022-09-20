package ejerciciogrupal;

import tda.Fecha;

public class MascotaTP {

    public static Fecha FechaActual = new Fecha(17, 9, 2022);

    private int codigo;
    private String nombre;
    private double peso;
    private Fecha FechaNacimiento;
    private int edad;
    private String tipo;
    private double dosis;

    public MascotaTP(int cod) {
        codigo = cod;
        nombre = "";
        peso = 0;
        FechaNacimiento = new Fecha(1, 1, 2000);
        edad = calcularEdad();
        tipo = "";
        dosis = calcularDosis();
    }

    public MascotaTP(int cod, String nn, double pe, Fecha fechaNac, String tip) {
        codigo = cod;
        nombre = nn;
        peso = pe;
        FechaNacimiento = fechaNac;
        edad = calcularEdad();
        tipo = tip;
        dosis = calcularDosis();
    }

    //  Metodos observadores
    public int getEdad() {
        return edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public Fecha getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public double getDosis() {
        return dosis;
    }
    
    

    public String toString() {
        return "\n Codigo: " + codigo + "\n Nombre: " + nombre + "\n Peso: " + peso + "\n Fecha Nacimiento: " + FechaNacimiento.toString() + " \n Edad: " + edad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechaNacimiento(Fecha FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodos Modificadores
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nn) {
        nombre = nn;
    }

    public void setPeso(double pe) {
        peso = pe;
    }

    // Propios del tipo
    public boolean equals(MascotaTP otraMascota) {
        return (codigo == otraMascota.getCodigo());
    }

    private double calcularDosis() {
        double dosisCalculada = 0;
        double extraEdad = 0;
        double extraPeso = 0;
        switch (tipo) {
            case "perro":
                if (peso < 5) {
                    dosisCalculada = 100;
                } else if ((5 <= peso) && (peso <= 15)) {
                    dosisCalculada = 150;
                } else if (peso > 15) {
                    if (edad > 6) {
                        for (int i = 7; i < edad; i++) {
                            extraEdad = extraEdad + 10;
                        }
                    }
                    dosisCalculada = 300 + extraEdad;
                }
                break;
            case "gato":
                if (peso < 1) {
                    dosisCalculada = 80;
                } else if (1 <= peso && peso <= 3) {
                    dosisCalculada = 120;
                } else {
                    dosisCalculada = 200;
                }

                break;
            case "tortuga":
                if (edad < 5) {
                    dosisCalculada = 50;
                } else if (5 <= edad && edad <= 20) {
                    dosisCalculada = 70;
                } else {
                    dosisCalculada = 150;
                }
                break;
            case "conejo":
                if (edad < 1) {
                    dosisCalculada = 20;
                } else if (edad >= 1) {
                    if (peso > 0.5) {
                        for (double i = 0.5; i < peso; i = i + 0.1) {
                            extraPeso = extraPeso + 1;
                        }
                    }
                    dosisCalculada = 25 + extraPeso;
                }
                break;
            default:
                dosisCalculada = -1;
                break;
        }
        return dosisCalculada;
    }

    private int calcularEdad() {
        int edadC;
        edadC = (FechaNacimiento.diasTranscurridos(FechaActual)) / 365;
        return edadC;
    }

}
