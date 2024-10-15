package Clase8;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = Math.pow(base, exponente);

        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);
    }
}
