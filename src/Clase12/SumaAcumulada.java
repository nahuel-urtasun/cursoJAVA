package Clase12;


import java.util.Scanner;

public class SumaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        String continuar;

        do {
            System.out.println("Ingresa un numero positivo:");
            number = scanner.nextInt();
            //scanner.nextLine();

            if (number > 0) {
                sum += number;
            } else {
                System.out.println("numero no es positivo, ingresa otro");
            }

            System.out.println("desea ingresar otro numero? si/no");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("si"));

        System.out.println("la suma acumulada es " + sum);
    }
}
