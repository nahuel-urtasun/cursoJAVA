package Clase8;

import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número positivo: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double raizCuadrada = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
        } else {
            System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
        }
    }
}
