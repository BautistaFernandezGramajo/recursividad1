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

    public Fecha(int d, int m, int a) {
        this.a = verificarAnio(a);
        this.m = verificarMes(m);
        this.d = verificarDia(d, this.m, this.a);
    }

    private int verificarAnio(int a) {
        int anioVeri;
        if (a > 0) {
            anioVeri = a;
        } else {
            anioVeri = 1;
        }
        return anioVeri;
    }

    private int verificarMes(int m) {
        int mesVeri;
        if ((0 < m) && (m <= 12)) {
            mesVeri = m;
        } else {
            mesVeri = 1;
        }
        return mesVeri;
    }

    private int verificarDia(int d, int m, int a) {
        int cantDias;
        int diaVeri;
        cantDias = diaPorMes(m);
        if ((0 < d) && (d <= cantDias)) {
            diaVeri = d;
        } else {
            diaVeri = 1;
        }
        return diaVeri;
    }

    private int diaPorMes(int m) {
        int diasMes;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                if (a % 4 == 0) {
                    diasMes = 29; // Es bisiesto
                } else {
                    diasMes = 28;
                }
                break;
            default:
                diasMes = 31;
        }
        return diasMes;
    }

    // Metodos Observadores
    public int getDia() {
        return d;
    }

    public int getMes() {
        return m;
    }

    public int getAnio() {
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

    public void setAnio(int a) {
        this.a = a;
    }

    // Propias del tipo
    public int diasTranscurridos(Fecha Fecha2) {
        // Dada una segunda fecha, obtengo la diferencia de dias que hay desde la propia del objeto a la segunda.
        int difDias = 0;
        int diaPorMes;
        /*
        Si los anios son iguales entonces la diferencia de dias
        estará dada por la suma de los meses de diferencia que hay entre
        ambas fechas, y la suma de dias de diferencia.
         */
        if (a == Fecha2.getAnio()) {
            // Suma de diferencia de meses
            for (int i = m; i < Fecha2.getMes(); i++) {
                diaPorMes = diaPorMes(i);
                difDias = difDias + diaPorMes;
            }
            // Suma de diferencia de dias
            for (int i = d; i < Fecha2.getDia(); i++) {
                difDias = difDias + 1;
            }
            /*Si este anio es menor que el otro, se hace lo mismo que en el if anterior, pero teniendo en cuenta la suma de dias por anio*/
        } else if (a < Fecha2.getAnio()) {
            // Suma de diferencia por anio
            for (int i = a; i < Fecha2.getAnio(); i++) {
                if (i % 4 == 0) {
                    difDias = difDias + 366;
                } else {
                    difDias = difDias + 365;
                }
            }
            // Suma de diferencia de meses
            for (int i = m; i < Fecha2.getMes(); i++) {
                diaPorMes = diaPorMes(i);
                difDias = difDias + diaPorMes;
            }
            // Suma de diferencia de dias
            for (int i = d; i < Fecha2.getDia(); i++) {
                difDias = difDias + 1;
            }
        } else if (a > Fecha2.getAnio()) {
            difDias = 0;
        }
        return difDias;
    }

}
