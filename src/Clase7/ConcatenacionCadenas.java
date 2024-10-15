package Clase7;

import java.util.Scanner;

public class ConcatenacionCadenas {

    public void concatenarNombres(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Su nombre completo es: " + nombreCompleto);
        System.out.println("Su nombre completo es: " + nombre + " " + apellido);
    }
}
