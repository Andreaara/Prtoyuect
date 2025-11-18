import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        InsertionSort sorting = new InsertionSort();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de numeros a ingresar");
        int num = sc.nextInt();
        double[] arr = new double[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Ingresa un numero");
            arr[i] = sc.nextDouble();

        }

        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(arr));

        System.out.println("Arreglo ordenado");
        sorting.sort(arr);
        double valorMinimo = arr[0];
        double valorMaximo = arr[arr.length - 1];
        double diferencia = valorMaximo - valorMinimo;

        System.out.println("Temperatura minima: " + valorMinimo);
        System.out.println("Temperatura maxima: " + valorMaximo);
        System.out.println("Valor diferencia de temperatura: " + diferencia);
        sorting.rangeSort(arr);


    }
}

