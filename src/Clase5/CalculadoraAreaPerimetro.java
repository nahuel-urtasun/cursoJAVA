package Clase5;

import java.util.Scanner;

public class CalculadoraAreaPerimetro {
    public void calcular(Scanner scanner) {
        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.print("Ingrese el número de la figura: ");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                System.out.println("¿Qué desea calcular?");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                int opcionCirculo = scanner.nextInt();
                switch (opcionCirculo) {
                    case 1:
                        double areaCirculo = Math.PI * radio * radio;
                        System.out.printf("El área del círculo es: %.2f%n", areaCirculo);
                        break;
                    case 2:
                        double perimetroCirculo = 2 * Math.PI * radio;
                        System.out.printf("El perímetro del círculo es: %.2f%n", perimetroCirculo);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            case 2:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = scanner.nextDouble();
                System.out.println("¿Qué desea calcular?");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                int opcionRectangulo = scanner.nextInt();
                switch (opcionRectangulo) {
                    case 1:
                        double areaRectangulo = base * altura;
                        System.out.printf("El área del rectángulo es: %.2f%n", areaRectangulo);
                        break;
                    case 2:
                        double perimetroRectangulo = 2 * (base + altura);
                        System.out.printf("El perímetro del rectángulo es: %.2f%n", perimetroRectangulo);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione un número entre 1 y 2.");
        }
    }
}
