package Clase12;

import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random() * 20) + 1;
        int guessNum;

        do {
            System.out.println("Cuál es el número secreto?");
            guessNum = scanner.nextInt();

            if (guessNum < num) {
                System.out.println("El número secreto es mayor.");
            } else if (guessNum > num) {
                System.out.println("El número secreto es menor.");
            }

        } while (guessNum != num);

        System.out.println("Adivinaste, el número era " + num);
        scanner.close();
    }
}
