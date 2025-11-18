import java.util.Arrays;

public class InsertionSort {

    public int sort(double[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) { //Comenzamos desde el segundo elemento
            double temp = arr[i]; //el primer elemento de la parte desordenada (comparativo)
            int j = i - 1;//comenzamos desde el ultimo elemento de la parte no ordenada
            while (j >= 0 && arr[j] > temp) {//recorrer la parte ordenada(fin-inicio)

                arr[j + 1] = arr[j];//recorrer la derecha los elementos  mayores al temporal
                j--;
            }
            //insertar el elemento en su posicion correcta
            arr[j + 1] = temp;


        }
        System.out.println(Arrays.toString(arr));
        return n;
    }

    public void rangeSort(double[] arr) {

            int n = arr.length;

            if (n < 1) {
                System.out.println("El arreglo está vacío.");
            }
            System.out.println("Temperaturas más bajas: ");
            int Inferior = 3;
            if (n < Inferior) {
                Inferior = n;
            }

            for (int i = 0; i < Inferior; i++) {
                System.out.println(arr[i]);
            }

            int Superior = n - 3;

            if (Superior < 0) {
                Superior = 0;
            }

            System.out.println("Temperaturas más altas: ");
            for (int i = Superior; i < n; i++) {
                System.out.println(arr[i]);
            }
        }
    }




