package Clase6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConExcepciones {

    public void restar(Scanner scanner) {
        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros.");
            scanner.nextLine();
        }
    }
}

