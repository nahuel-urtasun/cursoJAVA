package Clase5;

import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void verificarDiaHabil(Scanner scanner) {
        System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es un día hábil.");
                break;
            case 6:
            case 7:
                System.out.println("No es un día hábil.");
                break;
            default:
                System.out.println("Número inválido. Ingrese un número entre 1 y 7.");
        }
    }
}

