package tda;

import java.util.Scanner;

public class TestTerreno {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int codigo;
        double base;
        double altura;
        int manzana;

        System.out.println("Ingrese el codigo del terreno: ");
        codigo = sc.nextInt();
        System.out.println("Ingrese la base del terreno: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura del terreno: ");
        altura = sc.nextDouble();
        System.out.println("Ingrese la manzana del terreno: ");
        manzana = sc.nextInt();
        Terreno ter = new Terreno(codigo, base, altura, manzana);

        System.out.println("Ingrese una opcion: (1,2,3) ");
        int opcion;
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                // Operacion Inciso 1
                // Mostrar el perímetro del terreno y la cantidad de alambre si se desea poner un cerco que de tres vueltas alrededor del terreno.
                System.out.println("El perimetro del terreno es: " + ter.perimetro());
                System.out.println("El alambre necesario para rodearlo 3 veces es: " + 3 * ter.perimetro());
                break;
            case 2:
                // Operacion Inciso 2
                // Calcular la superfice del terreno y el costo de limpiarlo si la limpieza cuesta $150 por metro cuadrado.
                System.out.println("La superficie del terreno es: " + ter.superficie() + " y el costo de limpiarlo es de :" + ter.precio(150));
                break;
            case 3:
                int vMetro;
                // Operacion Inciso 3
                // Calcular el valor del terreno solicitándoles al usuario que ingrese el costo por metro cuadrado del terreno.
                System.out.println("Ingrese el valor del metro cuadrado: ");
                vMetro = sc.nextInt();
                System.out.println("El valor del terreno es: " + ter.precio(vMetro));
                break;
            default:
                System.out.println("Nro. Invalido...");
                break;
        }

    }
}
