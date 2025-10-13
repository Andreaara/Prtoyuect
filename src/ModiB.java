public class ModiB {
    
    public static void main(String[] args) {
        

        int [][] arrTest = {
            {1},
            {6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9},
            {2,4,8,9,10}

        };
        for (int i = 0; i < arrTest.length; i++) {

            int arreglo = arrTest[i].length;
            int valor;

            if (arreglo % 2 != 0) {
                valor = 0;
            } else {
                valor = arrTest[i][0] + arrTest[i][arreglo - 1];
            }

            int[] nuevoSubArreglo = new int[arreglo + 1];

            for (int j = 0; j < arreglo; j++) {
                nuevoSubArreglo[j] = arrTest[i][j];
            }

            nuevoSubArreglo[arreglo] = valor;

            arrTest[i] = nuevoSubArreglo;
        }

    for (int[] fila : arrTest) {
        System.out.print("{");
        for (int j = 0; j < fila.length; j++) {
            System.out.print(fila[j] +","+" ");
        }
        System.out.println("}");
    }

    }

}
