package Clase11;

public class calcularPromedio {
    public static void main(String[] args) {
        float [] numeros = {1.5f,2.4f,3.4f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f,10.1f,11.1f,12.1f,13.1f,14.1f,15.1f,16.2f,17.7f,18.8f,19.9f,20.1f};
        float suma =0;

        for (float numero : numeros) {
            suma += numero;
        }

        float promedio = suma/numeros.length;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
}