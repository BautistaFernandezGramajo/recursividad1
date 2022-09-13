package tda;

import java.util.Scanner;

public class AvionEjercicio8 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Avion[] aviones;
        int cantAviones;
        System.out.print("Ingrese la cantidad de aviones: ");
        cantAviones = sc.nextInt();
        aviones = new Avion[cantAviones];

        // Avion y Atributos 
        int identificador;
        String modelo;
        int cantAsientos;
        double km;
        double velPromedio;

        // Carga de Aviones al arreglo
        for (int i = 0; i < cantAviones; i++) {
            System.out.println("Avion Nro: " + (i + 1));
            System.out.println("Ingrese el identificador: ");
            identificador = sc.nextInt();
            System.out.println("Ingrese el modelo: ");
            modelo = sc.next();
            System.out.println("Ingrese la cantidad de asientos: ");
            cantAsientos = sc.nextInt();
            System.out.println("Ingrese la cantidad de km recorridos: ");
            km = sc.nextDouble();
            System.out.println("Ingrese la velocidad promedio del avión: ");
            velPromedio = sc.nextDouble();
            aviones[i] = new Avion(identificador, modelo, cantAsientos, km, velPromedio);
        }

        // Menu de opciones
        String opcion;
        boolean terminar = false;
        System.out.println("");
        System.out.println("1. Mostrar el avión que tiene mayor velocidad (en caso de iguales devolver el último encontrado)");
        System.out.println("2. Mostrar la cantidad de asientos que tiene un cierto avión (dado su identificador) ");
        System.out.println("3. Mostrar cuantos aviones de un cierto modelo tiene la empresa ");
        System.out.println("4. Mostrar el promedio de km recorrido por todos los aviones ");
        System.out.println("Ingrese cualquier otra tecla para terminar. ");
        do {
            System.out.println("Ingrese una opcion:");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    Avion avVeloz = aviones[0];
                    for (int i = 1; i < cantAviones; i++) {
                        if (aviones[i].getVelPromedio() >= avVeloz.getVelPromedio()) {
                            avVeloz = aviones[i];
                        }
                    }
                    System.out.println("El ID del Avion mas Rapido es: " + avVeloz.getIdentificador());
                    break;
                case "2":
                    boolean encontrado = false;
                    int identificadorS;
                    int i = 0;
                    System.out.println("Ingrese el Identificador: ");
                    identificadorS = sc.nextInt();
                    while (i < cantAviones && !encontrado) {
                        if (aviones[i].getIdentificador() == identificadorS) {
                            encontrado = true;
                        } else {
                            i += 1;
                        }
                    }
                    if (encontrado) {
                        System.out.println("La cantidad de asientos de ese avion (id:" + aviones[i].getIdentificador() + ") es: " + aviones[i].getCantAsientos());
                    } else {
                        System.out.println("Avion no encontrado.");;
                    }
                    break;
                case "3":
                    int cantModelosAvion = 0;
                    String modeloS;
                    System.out.println("Ingrese el modelo de avion: ");
                    modeloS = sc.next();
                    for (int j = 0; j < cantAviones; j++) {
                        if (modeloS.equals(aviones[j].getModelo())) {
                            cantModelosAvion = cantModelosAvion + 1;
                        }
                    }
                    System.out.println("La cantidad de aviones con el modelo " + modeloS + " son " + cantModelosAvion);
                    break;
                case "4":
                    double promedioKm = 0;
                    for (int j = 0; j < cantAviones; j++) {
                        promedioKm = promedioKm + aviones[j].getKm();
                    }
                    promedioKm = promedioKm / cantAviones;
                    System.out.println("El promedio total de km recorridos es: " + promedioKm);
                    break;
                default:
                    terminar = true;
                    break;
            }
        } while (!terminar);

    }
}
