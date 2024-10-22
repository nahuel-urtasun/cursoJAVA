package Clase11;

public class SumaAcumulada {
    public static void main(String[] args) {
        int[] array = {5, 66, 9, 10, 2};


        for (int i = 1; i < array.length; i++) {
            array[i] = array[i] + array[i - 1];
        }

        
        System.out.println("Array con suma acumulada:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
