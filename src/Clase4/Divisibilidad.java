package Clase4;
import java.util.Scanner;

public class Divisibilidad {
    public static void VerificarDivisibilidad(Scanner scanner) {

        System.out.println("Por favor, ingrese un número:");
        int numero = scanner.nextInt();


        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 3 y por 5.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es divisible por 5.");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else {
            System.out.println("El número no es divisible ni por 3 ni por 5.");
        }
    }
}
