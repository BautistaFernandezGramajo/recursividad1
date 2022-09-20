package tda;

import java.util.Scanner;

public class TestMascota {

    public static void main(String args[]) {
        // Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int codigo;
        String nombre;
        double peso;
        int edad;

        System.out.print("Ingrese el codigo de la mascota: ");
        codigo = sc.nextInt();
        System.out.print("Ingrese el nombre de la mascota: ");
        nombre = sc.next();
        System.out.print("Ingrese el peso de la mascota: ");
        peso = sc.nextDouble();
        System.out.print("Ingrese la edad de la mascota: ");
        edad = sc.nextInt();

        Mascota2 michi = new Mascota2(codigo, nombre, peso, edad);

        int opcion;
        System.out.print("Ingrese la opcion deseada: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                // Mostrar el nombre de la mascota
                System.out.print("El nombre de la mascota es: " + michi.getNombre());
                break;
            case 2:
                // Aumentar la edad de la mascota en 1
                michi.setEdad(michi.getEdad()+1);
                System.out.print("La edad de la mascota aumentada en 1 es: " + michi.getEdad());
                break;
            case 3:
                // Cambia el peso de la mascota por un valor ingresado por el usuario
                double pesoIng;
                System.out.print("Ingrese el peso por el cual desea cambiarlo: ");
                pesoIng = sc.nextDouble();
                michi.setPeso(pesoIng);
                System.out.println("El nuevo peso ingresado es: " + michi.getPeso());
                break;
            case 4:
                // Mostrar todos los datos de la mascota
                System.out.println("Los datos de la mascota son :" + michi.toString());
                break;
            default:
                System.out.println("Nro. Invalido");
                break;
        }

    }

}
