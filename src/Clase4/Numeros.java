package Clase4;

import java.util.Scanner;

public class Numeros {
    public static void clasificarNumero(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
