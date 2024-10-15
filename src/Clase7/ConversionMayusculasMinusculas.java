package Clase7;
import java.util.Scanner;

public class ConversionMayusculasMinusculas {

    public void convertirTexto(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String texto = scanner.nextLine();

        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir a mayúsculas");
        System.out.println("2. Convertir a minúsculas");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 -> System.out.println("Texto en mayúsculas: " + texto.toUpperCase());
            case 2 -> System.out.println("Texto en minúsculas: " + texto.toLowerCase());
            default -> System.out.println("Opción no válida.");
        }
    }
}
