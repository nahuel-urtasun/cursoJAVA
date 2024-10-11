package Clase6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DivisionSegura divisionSegura = new DivisionSegura();
        RestaConExcepciones restaConExcepciones = new RestaConExcepciones();
        ConversionCadenaEntero conversionCadenaEntero = new ConversionCadenaEntero();

        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. División Segura");
            System.out.println("2. Resta con Manejo de Excepciones");
            System.out.println("3. Conversión de Cadena a Entero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> divisionSegura.dividir(scanner);
                case 2 -> restaConExcepciones.restar(scanner);
                case 3 -> conversionCadenaEntero.convertirCadena(scanner);
                case 4 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }

            System.out.println();  // Línea en blanco para separar las ejecuciones
        } while (opcion != 4);

        scanner.close();
    }
}
