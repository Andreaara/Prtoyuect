public class NumerosNaturales {

    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i<= n; i++){
           System.out.println(" " + i);
        }
        System.out.println("Total de la suma: "+suma(n));


    }

        static int suma(int n) {
    if (n==0) return 0;
    return n + suma(n - 1);
    
    }
}
