package Clase11;

public class OrdenInverso {
    public static void main(String[] args) {
        int[] array = {5, 66, 9, 10, 2};
        for (int i = 1; i <= array.length; i++) {
            System.out.println(array[array.length - i]);
        }
    }
}

