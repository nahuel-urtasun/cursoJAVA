package Clase4;
import Clase4.Calificacion;
import Clase4.Divisibilidad;
import Clase4.Contrasenia;
import Clase4.Descuento;
import Clase4.Edades;
import Clase4.Numeros;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Menú de Opciones:");
            System.out.println("1. Validar Calificación");
            System.out.println("2. Verificar Divisibilidad");
            System.out.println("3. Verificación de Contraseña");
            System.out.println("4. Cálculo de Descuento");
            System.out.println("5. Determinación de Edades");
            System.out.println("6. Clasificación de Números");  // Nueva opción en el menú
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Calificacion.ValidarCalificacion(scanner);
                    break;
                case 2:
                    Divisibilidad.VerificarDivisibilidad(scanner);
                    break;
                case 3:
                    Contrasenia.verificarContrasenia(scanner);
                    break;
                case 4:
                    Descuento.calcularDescuento(scanner);
                    break;
                case 5:
                    Edades.determinarEdad(scanner);
                    break;
                case 6:
                    Numeros.clasificarNumero(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 7);

        scanner.close();
    }
}
