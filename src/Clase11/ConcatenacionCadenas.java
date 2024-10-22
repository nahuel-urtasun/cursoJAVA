package Clase11;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        // Inicializar el array de cadenas
        String[] palabras = {"Hola", "mundo", "Java", "es", "genial"};


        StringBuilder resultado = new StringBuilder();

        // Concatenar los elementos del array
        for (String palabra : palabras) {
            resultado.append(palabra).append(" ");
        }

        // Imprimir la cadena concatenada (sin el último espacio)
        System.out.println("Cadena concatenada: " + resultado.toString().trim());
    }
}
