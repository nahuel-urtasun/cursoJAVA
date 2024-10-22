package Clase12;

import java.util.Scanner;

public class InteractiveMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("=== Menú interactivo ===");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Comprar producto");
                    break;
                case 2:
                    System.out.println("Realizar devolución");
                    break;
                case 3:
                    System.out.println("Ver mis pedidos");
                    break;
                case 4:
                    System.out.println("Preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, elige una opción del 1 al 5.");
                    break;
            }

            System.out.println(); // Imprime una línea en blanco para separar las iteraciones
        }

        scanner.close();
    }
}
