package Clase5;

import java.util.Scanner;

public class ConversionCalificaciones {
    public static void convertirCalificacion(Scanner scanner) {
        System.out.print("Ingrese una calificación numérica del 1 al 5: ");
        int calificacion = scanner.nextInt();

        switch (calificacion) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Deficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Calificación inválida. Ingrese un número entre 1 y 5.");
        }
    }
}
