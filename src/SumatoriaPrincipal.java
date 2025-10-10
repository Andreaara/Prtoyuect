public class SumatoriaPrincipal {
    public static void main(String[] args) {

        int suma = 0;

         int [][] arrTest ={
            {1,2,7,8},
            {0,6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9,0}

        };

    

        for (int i = 0; i < arrTest.length; i++) {
            for (int j = 0; j < arrTest[i].length; j++){
               suma += arrTest[i][j];
               
               
            }
        }

        System.out.println(""+ suma);
       
    }
    
}
