package Clase7;


import java.util.Scanner;

public class BusquedaCaracteres {

    public void buscarCaracter(Scanner scanner) {
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.nextLine().charAt(0);

        int indice = palabra.indexOf(caracter);

        if (indice != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra.");
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }
    }
}
