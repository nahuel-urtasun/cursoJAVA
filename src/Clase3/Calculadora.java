
package src.Clase3;

import java.util.Scanner;

public class Calculadora {
    public static void calcular(Scanner scanner) {

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();


        System.out.print("Elige la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);


        double resultado = 0;


        resultado = (operacion == '+') ? (numero1 + numero2) :
                (operacion == '-') ? (numero1 - numero2) :
                        (operacion == '*') ? (numero1 * numero2) :
                                (operacion == '/') ? (numero1 / numero2) : Double.NaN;


        if (Double.isNaN(resultado)) {
            System.out.println("Operación no válida. Por favor, elige una operación correcta (+, -, *, /).");
        } else {
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}

