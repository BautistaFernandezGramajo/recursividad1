package tda;

import java.util.Scanner;

public class TestAutoLavadero {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Auto[] arrAutos = new Auto[3];

        // Atributos
        String patente;
        String nombreDuenio;
        int telefono;
        String servicio;

        // Carga del array
        for (int i = 0; i < arrAutos.length; i++) {
            System.out.println("Datos del Auto Nro: " + (i + 1));
            System.out.println("Ingrese la patente ");
            patente = sc.next();
            System.out.println("Ingrese el nombre del dueño ");
            nombreDuenio = sc.next();
            System.out.println("Ingrese el telefono del dueño ");
            telefono = sc.nextInt();
            System.out.println("Ingrese el servicio seleccionado ");
            servicio = sc.next();
            arrAutos[i] = new Auto(patente, nombreDuenio, telefono, servicio);
        }
        
        // Mostrar Lista Ordenada
        
        

    }
}
