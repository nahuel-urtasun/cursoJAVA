package Clase4;

import java.util.Scanner;

public class Contrasenia {
    public static void verificarContrasenia(Scanner scanner) {
        String contraseniaPredefinida = "1234";
        System.out.print("Ingrese la contraseña: ");
        String contraseniaIngresada = scanner.nextLine();

        if (contraseniaIngresada.equals(contraseniaPredefinida)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
