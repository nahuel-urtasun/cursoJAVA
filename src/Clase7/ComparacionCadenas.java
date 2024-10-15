package Clase7;

import java.util.Scanner;

public class ComparacionCadenas {

    public void compararCadenas(Scanner scanner) {
        System.out.print("Ingrese la primer palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }
    }
}
