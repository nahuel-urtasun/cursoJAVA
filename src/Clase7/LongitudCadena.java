package Clase7;

import java.util.Scanner;

public class LongitudCadena {

    public void mostrarLongitud(Scanner scanner) {
        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();
        int longitud = cadena.length();
        System.out.println("La longitud de la cadena es: " + longitud);
    }
}
