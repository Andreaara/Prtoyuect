import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        BubbleSort sorting = new BubbleSort();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de numeros a ingresar");
        int num = sc.nextInt();
        int[] arr  = new int[num];

        for ( int i = 0; i < num; i++ ) {

            System.out.println("Ingresa un numero");
            arr[i] = sc.nextInt();

        }

        System.out.println("Arreglo original");
        System.out.println(Arrays.toString(arr));

        int valorMinimo= sorting.sort(arr);
        int valorMaximo=arr[arr.length-1];
        int diferencia= valorMaximo-valorMinimo;

        System.out.println("Valor minimo: "+valorMinimo);
        System.out.println("Valor maximo: "+valorMaximo);
        System.out.println("Valor diferencia de valores: "+diferencia);


    }
}
