package Clase8;

import java.util.Scanner;
public class NumRandomRaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero entre 1 y 30");
        int numeroLimite = scanner.nextInt();

        int randomNum = (int) (Math.random() * (numeroLimite - 1) + numeroLimite);
        double raiz = Math.sqrt(randomNum);


        System.out.println("el numero aleatorio es:" + randomNum);
        System.out.println("la raiz cuadrada es " + raiz);

        boolean esPrimo = true;

        if (randomNum < 2) {
            System.out.println("no se puede");
        } else {
            for (int i = 2; i <= randomNum - 1; i++) {
                if (randomNum % i == 0) {
                    esPrimo = false;
                }
            }
        }

        if (esPrimo) {
            System.out.println("es un numero primo");
        } else
        System.out.println("no es un numero primo");
    }
}
