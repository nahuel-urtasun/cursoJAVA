package Clase7;

import java.util.Scanner;

public class ExtraccionSubcadena {

    public void extraerSubcadena(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese el índice inicial: ");
        int indiceInicial = scanner.nextInt();

        System.out.print("Ingrese el índice final: ");
        int indiceFinal = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        try {
            String subcadena = frase.substring(indiceInicial, indiceFinal);
            System.out.println("La subcadena es: " + subcadena);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Índices fuera de rango. Asegúrese de que los índices sean válidos.");
        }
    }
}
