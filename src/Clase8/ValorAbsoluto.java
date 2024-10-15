package Clase8;

import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto es: " + valorAbsoluto);
    }
}
