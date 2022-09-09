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

        // Operacion Inciso 1
        double perimetro = ter.perimetro();
        System.out.println("El perimetro del terreno es: " + perimetro);
        System.out.println("El alambre necesario para rodearlo 3 veces es: " + 3 * perimetro);

        // Operacion Inciso 2
        
        
    }
}
