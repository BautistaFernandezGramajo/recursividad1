package ejerciciogrupal;

import java.util.Scanner;
import tda.Fecha;

public class TestMascotaTDA2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Atributos de cada mascota
        int codigo;
        String nombre;
        double peso;
        Fecha fechaNacimiento;
        String tipo;
        MascotaTP mascota;

        // Atributos de la fecha
        int dia;
        int mes;
        int anio;

        // Programa Menú
        boolean terminar = false;
        int i = 0;
        MascotaTP[] arrMasc = new MascotaTP[10]; // Se pueden ingresar 10 mascotas como máximo.
        System.out.println("Opciones:");
        System.out.println("(1) Añadir una nueva mascota");
        System.out.println("(2) Buscar una mascota por nombre, mostrar sus datos y permitir modificar sus datos. ");
        System.out.println("(3) Buscar una mascota por nombre y mostrar la dosis de analgésicos que le corresponde");
        String opcion;
        do {
            System.out.println("Si desea finalizar, ingrese cualquiera otra tecla.");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    // Nueva mascota
                    System.out.println("Mascota número: " + (i + 1));
                    System.out.println("Ingrese el codigo: ");
                    codigo = sc.nextInt();
                    System.out.println("Ingrese el nombre: ");
                    nombre = sc.next();
                    System.out.println("Ingrese el peso en kilos: ");
                    peso = sc.nextDouble();
                    System.out.println("Ingrese la fecha de nacimiento: ");
                    System.out.print(" Año: ");
                    anio = sc.nextInt();
                    System.out.print(" Mes: ");
                    mes = sc.nextInt();
                    System.out.print(" Dia: ");
                    dia = sc.nextInt();
                    fechaNacimiento = new Fecha(dia, mes, anio);
                    System.out.println("");
                    System.out.println("Ingrese el tipo (Perro, Gato, Tortuga, Conejo) : ");
                    tipo = sc.next().toLowerCase(); // Paso a minusculas todos para que la clase funcione correctamente...
                    mascota = new MascotaTP(codigo, nombre, peso, fechaNacimiento, tipo);
                    if (verificarMascota(mascota.getNombre(), arrMasc)) { // Si no se encuentra una mascota con el mismo nombre entonces la carga
                        arrMasc[i] = mascota;
                        i = i++;
                    } else {
                        System.out.println("Esa mascota ya existe...");
                    }
                    break;
                case "2":
                    // 
                    String nombreS;
                    System.out.println("Ingrese el nombre de la mascota");
                    nombreS = sc.next();
                    if (verificarMascota(nombreS, arrMasc)) {
                        System.out.println("Ese nombre no existe");
                    } else {
                        System.out.println("Los datos de la mascota son: ");
                        arrMasc[posMascota(nombreS, arrMasc)].toString();
                        System.out.println("Desea modificar algun dato?");
                        
                    }
                    break;
                case "3":
                    break;
                default:
                    terminar = true;
                    break;
            }
        } while (!terminar && i < 10);
    }

    public static boolean verificarMascota(String nombre, MascotaTP[] arrayMasc) {
        boolean enco = false;
        int i = 0;
        while (i < arrayMasc.length && !enco) {
            if (arrayMasc[i].getNombre().equalsIgnoreCase(nombre)) {
                enco = true;
            }
            i = i++;
        }
        return enco;
    }

    public static int posMascota(String nombre, MascotaTP[] arrayMasc) {
        // Retorna la posición del array mascota donde se encuentra un mascota, comparando el nombre
        boolean enco = false;
        int i = 0;
        while (i < arrayMasc.length && !enco) {
            if (arrayMasc[i].getNombre().equalsIgnoreCase(nombre)) {
                enco = true;
            } else {
                i = i++;
            }
        }
        return i;
    }

}
