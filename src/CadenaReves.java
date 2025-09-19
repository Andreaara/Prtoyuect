public class CadenaReves {
    public static void main(String[] args) {
        String texto = "Trabajo palabra";
        System.out.println(Reves(texto));
    }


 static String Reves(String palabra){

    char[] reves = palabra.toCharArray();

    char invertir[] = new char[palabra.length()];

    for (int i = 0; i < reves.length; i++){
        invertir[i] = reves[reves.length - 1 - i ];
    }
    return new String(invertir);

 }


    
}
