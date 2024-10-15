package Clase7;

import java.util.Scanner;

public class ReemplazoCaracteres {

    public void reemplazarCaracteres(Scanner scanner) {
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        System.out.print("Ingrese la frase que desea reemplazar: ");
        String fraseVieja = scanner.nextLine();

        System.out.print("Ingrese la frase nueva: ");
        String fraseNueva = scanner.nextLine();

        String fraseFinal = frase.replaceAll(fraseVieja, fraseNueva);
        System.out.println("Frase final: " + fraseFinal);
    }
}
