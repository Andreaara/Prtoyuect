import java.util.Arrays;

public class ArreglosBidimensionales{
    public static void main(String[] args) {

        //Deckaración e inilización
        int [][] arrBiA=new int[4][4];
        
        //Declaración
        int[][] arrBib;

        //Inilización
        arrBib = new int [4] [4];

        System.out.println(arrBiA[0][0]);

        arrBiA[3][3] = 10;

        for (int i=0; i < arrBib.length; i++){
            for (int j = 0; j < arrBib.length; j++) {
                System.out.println(arrBib[i][j]);
                
            }
            System.out.println();
        }
        System.out.println(arrBib[0][3]);

        //Declaración literal
        int[][] arrBiC={
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}

        };

        //imprimer mediante for each
        for (int[] fila : arrBiC){
            for(int valor : fila){
                System.out.println(valor);
            }
            System.out.println();
        }

        int [][] arrBiD={
            {1,2,3},
            {1,2,3,4,5},
            {1},
            {2,2,2,2,2,2}
        };


        System.out.println(Arrays.toString(arrBiD[0]));
        
        for (int i=0; i < arrBiD.length; i++){
            for (int j = 0; j < arrBiD[i].length; j++) {
                System.out.println(arrBiD[i][j]);
                
            }
            System.out.println();
        }

        int [] a = {1,2,3,4};
        int [] b = new int[4];


//copiar arreglos
System.out.println(Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
            
        }

        System.out.println(Arrays.toString(b));

//copiar y mutar (hacer mas grand el arreglo)
        int[] c = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(c)); 


        //Ejercicio
        int [][] arrTest ={
            {1,2,7,8},
            {0,6,3,1},
            {1,2,3,4},
            {0,5,3,0},
            {2,5,9,0}

        };

        

    }
}