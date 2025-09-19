public class Potencia {

    public static void main(String[] args) {
        int base=9;
        int exponente=2;
        System.out.println("El resultado es " +potencia(base, exponente));


    }

    static int potencia(int base, int exponente){
      if (exponente==0)return 1;
      return base * potencia (base, exponente -1);
    }
    
}
