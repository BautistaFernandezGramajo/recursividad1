package tda;

import java.util.Scanner;

public class TestProducto {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Declaro un producto y sus atributos

        int cod;
        String descrip;
        double precio;
        double stock;

        // Carga del producto
        System.out.println("Ingrese el codigo del producto: ");
        cod = sc.nextInt();
        System.out.println("Ingrese la descripcion del producto: ");
        descrip = sc.next();
        System.out.println("Ingrese el precio del prodcuto: ");
        precio = sc.nextDouble();
        System.out.println("Ingrese el stock: ");
        stock = sc.nextDouble();
        Producto p = new Producto(cod, descrip, precio, stock);

        // Menú
        boolean terminar = false;
        int opcion;
        System.out.println("Opcion 1: Mostrar descripcion");
        System.out.println("Opcion 2: Realizar calculo de costo");
        System.out.println("Opcion 3: Disminuir stock");
        System.out.println("Presione cualquier otra tecla para finalizar.");
        do {
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La descripcion del producto es: " + p.getDescripcion());
                    break;
                case 2:
                    double cantidad;
                    System.out.println("Ingrese una cantidad");
                    cantidad = sc.nextDouble();
                    System.out.println("El costo es: " + p.calcularCosto(cantidad));
                    break;
                case 3:
                    double cantResta;
                    System.out.println("Ingrese una cantidad");
                    cantResta = sc.nextDouble();
                    p.restarStock(cantResta);
                    System.out.println("El stock disponible ahora es: " + p.getStock());
                    break;
                default:
                    terminar = true;
                    break;

            }
        } while (!terminar);
    }

}
