package Clase12;

import java.util.Scanner;

public class TabladeMultiplicar {
    public static void main(String[] args) {
        System.out.println("\033\143");
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un numero entero:");
            num = scanner.nextInt();
            int cont = 1;
            if (num != 0) {
                while (cont <= 10) {
                    System.out.println(cont + " * " + num + " = " + num * cont);
                    cont++;
                }
            }
        } while (num != 0);
        scanner.close();
    }
}
