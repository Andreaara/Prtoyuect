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

        int[][] arrModificado = new int[arrTest.length][];

    if(arrTest.length % 2 == 0 ){
        for (int i = 0; i < arrTest.length; i++) {

            int arreglo = arrTest[i].length;

            arrModificado[i] = new int [arreglo + 1];
            
            for (int j = 0; j < arrTest[i].length; j++) {

                arrModificado[i][j] = arrTest[i][j]; 

               
                arrModificado[i][arreglo] = arrTest[i][arreglo - 1 ]+1;
                
                
            }

            
            
        }
    }else if(arrTest.length % 2 == 1){
            for (int i = 0; i < arrTest.length; i++) {

            int arreglo = arrTest[i].length;

            arrModificado[i] = new int [arreglo + 1];
            
            for (int j = 0; j < arrTest[i].length; j++) {

                arrModificado[i][j] = arrTest[i][j]; 

               
                arrModificado[i][arreglo] = arrTest[i][arreglo - 1 ] = 0;
                
                
            }
        }

    }

    for (int[] fila : arrModificado) {
        System.out.println("{");
        for (int j = 0; j < fila.length; j++) {
            System.out.print(fila[j] +","+" ");
        }
        System.out.println("}");
    }





    }


}
