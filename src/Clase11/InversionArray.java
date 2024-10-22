package Clase11;

public class InversionArray {
    public static void main(String[] args) {
        int[] array = {5, 66, 9, 10, 2};
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }

        System.out.println("Array invertido:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
    }
}

