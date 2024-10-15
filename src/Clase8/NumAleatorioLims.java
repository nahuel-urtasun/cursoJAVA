package Clase8;

import java.util.Scanner;

public class NumAleatorioLims {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el límite inferior: ");
        int limiteInferior = scanner.nextInt();

        System.out.print("Ingrese el límite superior: ");
        int limiteSuperior = scanner.nextInt();

        if (limiteInferior < limiteSuperior) {
            int numeroAleatorio = (int) (Math.random() * (limiteSuperior - limiteInferior + 1)) + limiteInferior;
            System.out.println("El número aleatorio generado entre " + limiteInferior + " y " + limiteSuperior + " es: " + numeroAleatorio);
        } else {
            System.out.println("Error: El límite inferior debe ser menor que el límite superior.");
        }
    }
}
