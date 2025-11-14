public class QuickSort {

    public void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);

    }

    private void quickSort(int[] arr, int low, int high){
        if (low<high) {//caso base
            
            int pivote = partition(arr, low, high);//realiza la particion del arreglo
            //llamados recursivos para los subarreglos

            //ordenar el lado izquierdo
            quickSort(arr,low, pivote-1);

            //ordenar el lado derecho
            quickSort(arr, pivote+1, high);
        }
    }

 private int partition(int[] arr, int low, int high){
    int pivote = arr[high];//seleccion del pivote (ultimo elemento)
    int i=low-1;//establece la frontera de los elementos mejores que el pivote

    for(int j = low; j< high; j++){
        if(arr[j]< pivote){
            i++;//incrementa la frontera de los menores
            swap(arr, i, j); //realiza el intercambio del elemento corriente de la primera posición de la frontera
        }
    }

    //mover le pivote a la posisción final de la frontera
    swap(arr, i+1, high);
    return i+1;//devuelve la posicion del pivote
 }

private void swap(int[] arr, int i, int j){ //realiza el intercambion de la posicion de un arreglo
    int temp = arr[i];
    arr[i] =arr[j];
    arr[j]= temp;

}

}