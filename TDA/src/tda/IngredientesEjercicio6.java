package tda;

import java.util.Scanner;

public class IngredientesEjercicio6 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Ingrediente[] receta; // La receta suponemos que es un arreglo de ingredientes.
        Ingrediente ing;
        int cantIngredientes; // Debido al uso de Array, la dimension tiene que estar definida
        System.out.print("Ingrese la cantidad de ingredientes de la receta: ");
        cantIngredientes = sc.nextInt();
        receta = new Ingrediente[cantIngredientes];

        // Atributos de Ingrediente
        String nombre;
        double cantidad;
        String unidad;

        // Carga de atributos por cada ingrediente
        for (int i = 0; i < cantIngredientes; i++) {
            System.out.println("Ingrediente nro: " + (i + 1));
            System.out.println("Ingrese el nombre del ingrediente: ");
            nombre = sc.next();
            System.out.println("Ingrese la unidad del ingrediente: ");
            unidad = sc.next();
            System.out.println("Ingrese la cantidad del ingrediente: ");
            cantidad = sc.nextDouble();
            ing = new Ingrediente(nombre, cantidad, unidad);
            receta[i] = ing;
        }

        // Opciones del usuario
        int opcion;
        System.out.println("Que opcion desea ingresar?");
        System.out.println("1. Listar ingredientes, 2. Verificar si un ingrediente es necesario en la receta.");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < cantIngredientes; i++) {
                    System.out.println("Ingrediente nro: " + (i + 1));
                    System.out.println(receta[i].toString());
                }
                break;
            case 2:
                boolean verificar = false;
                int i = 0;
                String nombreIng;
                System.out.println("Ingrese el nombre del ingrediente:");
                nombreIng = sc.next();
                while(!verificar && i<cantIngredientes){
                verificar = receta[i].getNombre().equalsIgnoreCase(nombreIng); // Observo el nombre de cada elemento y los comparo con los nombres ingresados
                i = i + 1;
                }
                if(verificar){
                    System.out.println("Es necesario");
                }else{
                    System.out.println("No es necesario");
                }
                break;
            default:
                System.out.println("número invalido..");
                break;
        }

    }
}
