package Clase12;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secreto";
        String inputPassword = "";

        while (!inputPassword.equals(correctPassword)) {
            System.out.println("Ingrese la contraseña:");
            inputPassword = scanner.nextLine();
        }

        System.out.println("Contraseña correcta");
    }
}
