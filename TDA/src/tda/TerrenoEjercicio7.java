package tda;

import java.util.Scanner;

public class TerrenoEjercicio7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Terreno[] terrenos;
        int cantTerrenos;
        System.out.print("Ingrese la cantidad de terrenos: ");
        cantTerrenos = sc.nextInt();
        terrenos = new Terreno[cantTerrenos]; // Arreglo de terrenos

        Terreno ter; // Elemento terreno para ir guardando en el arreglo
        // Atributos de los terrenos
        int codigo;
        double base;
        double altura;
        int manzana;

        // Carga del arreglo
        for (int i = 0; i < cantTerrenos; i++) {
            System.out.println("Terreno nro: " + (i + 1));
            System.out.println("Ingrese el codigo: ");
            codigo = sc.nextInt();
            System.out.println("Ingrese la base: ");
            base = sc.nextDouble();
            System.out.println("Ingrese la altura: ");
            altura = sc.nextDouble();
            System.out.println("Ingrese la manzana en la que se encuentra: ");
            manzana = sc.nextInt();
            ter = new Terreno(codigo, base, altura, manzana);
            terrenos[i] = ter; // Guardo en el elemento i del arreglo.
        }

        // Menu de opciones
        System.out.println("");
        System.out.println("1. Encontrar terreno mas grande. ");
        System.out.println("2. Dado un codigo, mostrar dimensiones. ");
        System.out.println("3. Dada una manzana, mostrar los datos de los terrenos que se encuentran en ella.");
        System.out.println("4. Mostrar el precio de cada uno de los terrenos. (Ingresando el precio) ");
        System.out.println("Ingrese cualquier otra tecla para terminar.");
        System.out.println("");
        String opcion;
        boolean terminar = false;
        do {
            System.out.println("Ingrese la opcion deseada: ");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    Terreno terGrande = terrenos[0]; // Se asume que el terreno mas grande es el primero del arreglo y de ahi compara...
                    for (int i = 0; i < cantTerrenos; i++) {
                        if (terrenos[i].superficie() >= terGrande.superficie()) {
                            terGrande = terrenos[i];
                        }
                    }
                    System.out.println("El terreno mas grande es el terreno de codigo: " + terGrande.getCodigo() + " con una superficie total de " + terGrande.superficie());
                    break;
                case "2":
                    boolean encontrado = false;
                    int i = 0;
                    int codigoD;
                    System.out.println("Ingrese el codigo: ");
                    codigoD = sc.nextInt();
                    while (i < cantTerrenos && !encontrado) {
                        if (terrenos[i].getCodigo() == codigoD) {
                            encontrado = true;
                            System.out.println("Base: " + terrenos[i].getBase() + "\n Altura: " + terrenos[i].getAltura());
                        } else if (i == (cantTerrenos - 1) && !encontrado) { // En caso de no haber ningun terreno con ese codigo, que le avise al usuario.
                            System.out.println("No hay un terreno con ese código.");
                        }
                        i += i;
                    }
                    break;
                case "3":
                    int manzanaS;
                    System.out.println("Ingrese una manzana: ");
                    manzanaS = sc.nextInt();
                    for (int j = 0; j < cantTerrenos; j++) {
                        if (terrenos[j].getManzana() == manzanaS) {
                            System.out.println(terrenos[j].toString());
                        }
                    }
                    break;
                case "4":
                    double precioS;
                    System.out.println("Ingrese el valor de los metros cuadrados: ");
                    precioS = sc.nextDouble();
                    for (int j = 0; j < cantTerrenos; j++) {
                        System.out.println("El precio del terreno (codigo " + terrenos[j].getCodigo() + " ) es: " + terrenos[j].precio(precioS) + "$");
                    }
                    break;
                default:
                    terminar = true;
                    break;
            }
        } while (!terminar);

    }
}
