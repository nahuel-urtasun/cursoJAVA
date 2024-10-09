package Clase5;
import Clase4.Descuento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiasDeLaSemana diasDeLaSemana = new DiasDeLaSemana();
        SeleccionOpcion seleccionOpcion = new SeleccionOpcion();
        SeleccionFigura seleccionFigura = new SeleccionFigura();
        VerificacionDiaHabil verificacionDiaHabil = new VerificacionDiaHabil();
        CalculadoraAreaPerimetro calculadoraAreaPerimetro = new CalculadoraAreaPerimetro();
        ConversionCalificaciones conversionCalificaciones = new ConversionCalificaciones();
        Descuento descuento = new Descuento();

        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Verificar Día de la Semana");
            System.out.println("2. Conversión de Calificaciones");
            System.out.println("3. Selección de Opción");
            System.out.println("4. Selección de Figura Geométrica (Área)");
            System.out.println("5. Verificación de Día Hábil");
            System.out.println("6. Calculadora de Área y Perímetro");
            System.out.println("7. Descuento");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                    diasDeLaSemana.mostrarDia(scanner);
                    break;
                case 2:
                    conversionCalificaciones.convertirCalificacion(scanner);
                    break;
                case 3:
                    seleccionOpcion.seleccionarOpcion(scanner);
                    break;
                case 4:
                    seleccionFigura.calcularArea(scanner);
                    break;
                case 5:
                    verificacionDiaHabil.verificarDiaHabil(scanner);
                    break;
                case 6:
                    calculadoraAreaPerimetro.calcular(scanner);
                    break;
                case 7:
                    descuento.calcularDescuento(scanner);
                case 8:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 8);

        scanner.close();
    }
}
