package Clase4;
import java.util.Scanner;

public class Calificacion {
    public static void ValidarCalificacion(Scanner scanner) {

        System.out.println("Por favor, ingrese una puntuación entre 0 y 100:");
        int puntuacion = scanner.nextInt();


        if (puntuacion >= 0 && puntuacion <= 100) {

            if (puntuacion >= 90) {
                System.out.println("A");
            } else if (puntuacion >= 80) {
                System.out.println("B");
            } else if (puntuacion >= 70) {
                System.out.println("C");
            } else if (puntuacion >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {

            System.out.println("El número ingresado está fuera del rango válido.");
        }
    }
}
