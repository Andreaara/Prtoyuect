import java.util.Arrays;

public class BubbleSort{
    public void sort(int[] arr){
        int n = arr.length;
        boolean swapped=false;

        //recorremos todos los elementos del arreglo
        for (int i = 0; i < n-1; i++) {
            //recorremos los elementos adyacentes -1 -i (porlos que ya fueron recorridos)
            for (int j = 0; j < n-1-i; j++) {
                //Pregunta si el elemento corriente es mayor que el siguiente
                if(arr[j]>arr[j+1]){
                    //Se realiza el intercambio
                    int temp = arr[j];
                    arr[j]=arr[j+1];//pasa el elemento siguiente al actual
                    arr[j+1]=temp;//asigna el sigueinte elemento con el valor de temp
                    swapped=true;
                }
            }
            if(!swapped)break;

        }

        System.out.println("Arreglo");
        System.out.println(Arrays.toString(arr));
    }


    public int[] duplicados(int[] arr) {
        int count=1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!= arr[i-1]) {
                count++;
            }
        }

        int[] result = new int[count];
        if (arr.length > 0) {
            result[0]=arr[0];
        }

        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!= arr[i-1]) {
                result[index]=arr[i];
                index++;
            }
        }

        return result;
    }
}
