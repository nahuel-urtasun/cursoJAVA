package Clase6;

import java.util.Scanner;


public class DivisionSegura {

    public void dividir(Scanner scanner) {
        try {
            System.out.print("Ingrese el primer número: ");
            int dividendo = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int divisor = scanner.nextInt();

            int resultado = dividendo / divisor;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Boom!");
            e.printStackTrace();
        }
    }
}
