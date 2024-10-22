package Clase12;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int num = scanner.nextInt();
        int tempNumber = Math.abs(num);

        int contador = 0;
        if (tempNumber == 0)
            contador++;

        while (tempNumber > 0) {
            tempNumber = tempNumber / 10;
            contador++;

        }

        System.out.println("La cantidad de digitos de " + num + " es: " + contador);
    }
}