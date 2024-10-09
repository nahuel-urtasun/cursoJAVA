package Clase5;

import java.util.Scanner;

public class SeleccionOpcion {
    public void seleccionarOpcion(Scanner scanner) {
        System.out.println("Menú de Opciones:");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has seleccionado la opción: Guardar");
                break;
            case 2:
                System.out.println("Has seleccionado la opción: Cargar");
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione un número entre 1 y 3.");
        }
    }
}
