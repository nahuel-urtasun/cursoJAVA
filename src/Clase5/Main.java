package Clase5;

import Clase5.DiasDeLaSemana;
import Clase5.ConversionCalificaciones;
import Clase5.SeleccionOpcion;
import Clase5.SeleccionFigura;
import Clase5.VerificacionDiaHabil;
import Clase5.CalculadoraAreaPerimetro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Verificar Día de la Semana");
            System.out.println("2. Conversión de Calificaciones");
            System.out.println("3. Selección de Opción");
            System.out.println("4. Selección de Figura Geométrica (Área)");
            System.out.println("5. Verificación de Día Hábil");
            System.out.println("6. Calculadora de Área y Perímetro");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    DiasDeLaSemana.mostrarDia(scanner);
                    break;
                case 2:
                    ConversionCalificaciones.convertirCalificacion(scanner);
                    break;
                case 3:
                    SeleccionOpcion.seleccionarOpcion(scanner);
                    break;
                case 4:
                    SeleccionFigura.calcularArea(scanner);
                    break;
                case 5:
                    VerificacionDiaHabil.verificarDiaHabil(scanner);
                    break;
                case 6:
                    CalculadoraAreaPerimetro.calcular(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 7);

        scanner.close();
    }
}
