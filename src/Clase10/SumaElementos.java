package Clase10;

import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[4];
        String temp = "";


        System.out.println("ingrese el nombre 1");
        nombres[0] = scanner.nextLine();
        System.out.println("ingrese el nombre 2");
        nombres[1] = scanner.nextLine();
        System.out.println("ingrese el nombre 3");
        nombres[2] = scanner.nextLine();
        System.out.println("ingrese el nombre 4");
        nombres[3] = scanner.nextLine();


        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }
        if (nombres[1].compareTo(nombres[2]) > 0) {
            temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }
        if (nombres[2].compareTo(nombres[3]) > 0) {
            temp = nombres[2];
            nombres[2] = nombres[3];
            nombres[3] = temp;
        }
        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }
        if (nombres[1].compareTo(nombres[2]) > 0) {
            temp = nombres[1];
            nombres[1] = nombres[2];
            nombres[2] = temp;
        }
        if (nombres[0].compareTo(nombres[1]) > 0) {
            temp = nombres[0];
            nombres[0] = nombres[1];
            nombres[1] = temp;
        }

        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);




    }
}


