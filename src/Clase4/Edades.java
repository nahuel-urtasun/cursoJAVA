package Clase4;

import java.util.Scanner;

public class Edades {
    public static void determinarEdad(Scanner scanner) {
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
    }
}
