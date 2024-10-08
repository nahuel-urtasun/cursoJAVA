package Clase4;

import java.util.Scanner;

public class Descuento {
    public static void calcularDescuento(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        if (precio >= 100) {
            double descuento = precio * 0.10;
            double precioConDescuento = precio - descuento;
            System.out.printf("Precio con descuento: $%.2f%n", precioConDescuento);
        } else {
            System.out.printf("Precio original sin descuento: $%.2f%n", precio);
        }
    }
}
