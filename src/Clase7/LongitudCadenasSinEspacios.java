package Clase7;

import java.util.Scanner;

public class LongitudCadenasSinEspacios {

    public void calcularLongitudSinEspacios(Scanner scanner) {
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        int longitudSinEspacios = texto.replace(" ", "").length();
        System.out.println("La longitud de la cadena sin contar los espacios es: " + longitudSinEspacios);
    }
}
