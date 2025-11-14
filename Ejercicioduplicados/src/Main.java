import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubblesort = new BubbleSort();
        int[] arr = {4, 2, 9, 2, 4, 7, 1};
        int[] Duplicados = bubblesort.duplicados(arr);


        System.out.println("-----------Arreglo original-------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("----------Arreglo ordenado---------");
        bubblesort.sort(arr);
        System.out.println("-----------Arreglo sin duplicados ----------");
        System.out.println(Arrays.toString(Duplicados));


    }

}