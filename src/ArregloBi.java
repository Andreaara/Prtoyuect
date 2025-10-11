public class ArregloBi {

    public static void main(String[] args) {

        int[][] arrTest = {
                {1},
                {6, 3, 1},
                {1, 2, 3, 4},
                {0, 5, 3, 0},
                {2, 5, 9},
                {2, 4, 8, 9, 10}
        };

        int[][] modificadoArreglo = new int[arrTest.length][];

        for (int i = 0; i < arrTest.length; i++) {
            int arreglo = arrTest[i].length;

            modificadoArreglo[i] = new int[arreglo + 1];

            for (int j = 0; j < arreglo; j++) {
                modificadoArreglo[i][j] = arrTest[i][j];

                modificadoArreglo[i][arreglo] = arrTest[i][arreglo - 1] + 1;

            }


        }

        for (int[] fila : modificadoArreglo) {
            System.out.print("{");
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j] + ","+" " );
            }
            System.out.println("}");
        }



    }
}
