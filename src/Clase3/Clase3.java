package src.Clase3;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Calcular (Calculadora)");
            System.out.println("2. Determinar si un número es par o impar");
            System.out.println("3. Salir");
            System.out.print("Elige una opción (1/2/3): ");

            if (scanner.hasNextInt()) {
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        Calculadora.calcular(scanner); // Llamada a la clase Calculadora
                        break;
                    case 2:
                        ParImpar.determinarParImpar(scanner); // Llamada a la clase ParImpar
                        break;
                    case 3:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        scanner.close();
                        return; // Salir del programa
                    default:
                        System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
                        break;
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                scanner.next();
            }
        }
    }
}
