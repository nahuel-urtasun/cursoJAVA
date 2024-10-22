package Clase11;

public class EncontrandoMin {
    public static void main(String[] args) {
        int[] array = {5, 66, 9, 10, 2};
        int min = 0;
        min = array[0];

        for (int num : array) {
            if (min > num) {
                min = num;
            }
        }
        System.out.println("el minimo es: " + min);
    }
}

