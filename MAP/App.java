
import java.util.Map;
import java.util.TreeMap;

public class App{

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
                                      //HashMap
                                      //LinkedHashMap
                                      //
        
        map.put(1, "Mouse");
        map.put(2, "Teclado");
        map.put(3, "Monitor");
        map.put(1, "Mouse Gamer");//sustituye el valor de la key

        System.out.println(map);

        String data =map.get(1);//obtener valor por key
        System.out.println(data);//maouse gamer
        boolean exist = map.containsValue("Teclado");//verificar si existe el objeto
        System.out.println("Hay un teclado? "+ exist);
        map.remove(1);//eli9minar key

        for (Map.Entry <Integer, String> row: map.entrySet()) {
            System.out.println("La key es: " + row.getKey()+" el valor es "+ row.getValue());
        }
        boolean existKey = map.containsKey(2);
        System.out.println(existKey);
    }

}