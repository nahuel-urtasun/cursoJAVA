package src.Clase3;

import java.util.Scanner;

public class ParImpar {
    public static void determinarParImpar(Scanner scanner) {
        System.out.print("Ingresa un número para determinar si es par o impar: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}


