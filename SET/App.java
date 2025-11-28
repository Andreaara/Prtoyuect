import java.util.Set;
import java.util.TreeSet;

public class App{
    public static void main(String[] args) {
        
        Set<String> set = new TreeSet<>();
                                //Hashset
                               //LinkedHashSet
                               //TreeSet
        set.add("Azul");
        set.add("Verde");
        set.add("Rojo");
        set.add("Amarillo");
        set.add("Rojo");//se omitio
      
        System.out.println(set);//impresión

        boolean exisRed = set.contains("Rojo");//existe x objeto
        System.out.println("existe el rojo?"+exisRed);

        set.remove("Verde");//elimina elemento
        int tam = set.size();//obtiene tamaño

        for (String data : set){//recorrido estandar
            System.out.println("Dato: "+data);
        }

        System.out.println("El tamaño actual es de: "+tam);
    }
}