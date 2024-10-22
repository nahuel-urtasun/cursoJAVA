import java.util.Random;

public class ContarPares {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();
        int contadorPares = 0;


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }


        System.out.print("Elementos del array: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();


        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }


        System.out.println("Total de números pares: " + contadorPares);
    }
}