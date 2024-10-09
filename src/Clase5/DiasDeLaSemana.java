package Clase5;

import java.util.Scanner;

public class DiasDeLaSemana {
    public static void mostrarDia(Scanner scanner) {
        System.out.print("Ingrese un número del 1 al 7 para representar un día de la semana: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido. Ingrese un número entre 1 y 7.");
        }
    }
}
