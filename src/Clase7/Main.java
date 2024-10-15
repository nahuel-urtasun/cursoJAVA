package Clase7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LongitudCadena longitudCadena = new LongitudCadena();
        ConcatenacionCadenas concatenacionCadenas = new ConcatenacionCadenas();
        ExtraccionSubcadena extraccionSubcadena = new ExtraccionSubcadena();
        BusquedaCaracteres busquedaCaracteres = new BusquedaCaracteres();
        ConversionMayusculasMinusculas conversionMayusculasMinusculas = new ConversionMayusculasMinusculas();
        ReemplazoCaracteres reemplazoCaracteres = new ReemplazoCaracteres();
        EliminacionEspacios eliminacionEspaciosBlanco = new EliminacionEspacios();
        ComparacionCadenas comparacionCadenas = new ComparacionCadenas();
        LongitudCadenasSinEspacios longitudSinEspacios = new LongitudCadenasSinEspacios();

        int opcion;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Longitud de Cadena");
            System.out.println("2. Concatenación de Cadenas");
            System.out.println("3. Extracción de Subcadena");
            System.out.println("4. Búsqueda de Caracteres");
            System.out.println("5. Conversión de Mayúsculas y Minúsculas");
            System.out.println("6. Reemplazo de Caracteres");
            System.out.println("7. Eliminación de Espacios en Blanco");
            System.out.println("8. Comparación de Cadenas");
            System.out.println("9. Longitud de Cadenas sin Espacios");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> longitudCadena.mostrarLongitud(scanner);
                case 2 -> concatenacionCadenas.concatenarNombres(scanner);
                case 3 -> extraccionSubcadena.extraerSubcadena(scanner);
                case 4 -> busquedaCaracteres.buscarCaracter(scanner);
                case 5 -> conversionMayusculasMinusculas.convertirTexto(scanner);
                case 6 -> reemplazoCaracteres.reemplazarCaracteres(scanner);
                case 7 -> eliminacionEspaciosBlanco.eliminarEspacios(scanner);
                case 8 -> comparacionCadenas.compararCadenas(scanner);
                case 9 -> longitudSinEspacios.calcularLongitudSinEspacios(scanner);
                case 10 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida, intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 10);

        scanner.close();
    }
}
