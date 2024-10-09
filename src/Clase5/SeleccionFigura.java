package Clase5;

import java.util.Scanner;

public class SeleccionFigura {
    public static void calcularArea(Scanner scanner) {
        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("Ingrese el número de la figura: ");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                double areaCirculo = Math.PI * radio * radio;
                System.out.printf("El área del círculo es: %.2f%n", areaCirculo);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                double areaCuadrado = lado * lado;
                System.out.printf("El área del cuadrado es: %.2f%n", areaCuadrado);
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.printf("El área del triángulo es: %.2f%n", areaTriangulo);
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione un número entre 1 y 3.");
        }
    }
}

