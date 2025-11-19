import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SelectionSort sorting = new SelectionSort();

        System.out.println("Introduzca el numero de numeros a ingresar");
        int n = sc.nextInt();
        int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.print("Ingresa un número ");
                    arr[i] = sc.nextInt();
                }
                int contadorPares =0;
                int contadorImpares =0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0)
                        contadorPares++;
                    else
                        contadorImpares++;
                }

                int[] pares = new int[contadorPares];
                int[] impares = new int[contadorImpares];

                int par = 0;
                int impar = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0)
                        pares[par++] = arr[i];
                    else
                        impares[impar++] = arr[i];
                }



                System.out.println("Arreglo original: " + Arrays.toString(arr));
                System.out.println(" Arreglo de pares ordenados: " + Arrays.toString(pares));
                System.out.println("Arreglo de impares ordenados: " + Arrays.toString(impares));


    }
}
