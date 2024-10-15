package Clase7;

import java.util.Scanner;

public class EliminacionEspacios {

    public void eliminarEspacios(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String fraseSinEspacios = frase.trim();
        System.out.println("Frase sin espacios: '" + fraseSinEspacios + "'");
    }
}
