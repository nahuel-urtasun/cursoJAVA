package Clase5;

import java.util.Scanner;

public class VerificacionDiaHabil {
    public void verificarDiaHabil(Scanner scanner) {
        System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1,2,3,4,5 -> System.out.println("Es un día hábil.");
            case 6,7 -> System.out.println("No es un día hábil.");
            default -> System.out.println("Número inválido. Ingrese un número entre 1 y 7.");
        }
    }
}

