package Clase8;

public class NumeroAleatorio {
    public static void main(String[] args) {
        int numeroAleatorio = (int) Math.floor((Math.random() * (355 - 1) + 1));
        //int numeroRedondeado = (int) Math.floor(numeroAleatorio);

        System.out.println("El número aleatorio generado es: " + numeroAleatorio);
    }
}
