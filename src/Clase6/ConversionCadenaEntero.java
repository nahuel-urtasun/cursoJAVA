package Clase6;
import java.util.Scanner;

public class ConversionCadenaEntero {
    public void convertirCadena(Scanner scanner) {
        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no es un número entero.");
        }
    }
}
