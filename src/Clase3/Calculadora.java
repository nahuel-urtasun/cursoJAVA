package src.Clase3;

import java.util.Scanner;

public class Calculadora {
    public static void calcular(Scanner scanner) {
        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicitar al usuario que elija la operación
        System.out.print("Elige la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        // Declarar la variable para almacenar el resultado de la operación
        double resultado = 0;

        // Calcular el resultado usando el operador ternario para la lógica básica
        resultado = (operacion == '+') ? (numero1 + numero2) :
                (operacion == '-') ? (numero1 - numero2) :
                        (operacion == '*') ? (numero1 * numero2) :
                                (operacion == '/') ? (numero1 / numero2) : Double.NaN;

        // Mostrar el resultado en la consola
        if (Double.isNaN(resultado)) {
            System.out.println("Operación no válida. Por favor, elige una operación correcta (+, -, *, /).");
        } else {
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}
