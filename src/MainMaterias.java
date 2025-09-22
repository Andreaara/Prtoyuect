import java.util.ArrayList;
import java.util.List;

public class MainMaterias {

    public static void main(String[] args) {

        ListaMaterias Materias = new ListaMaterias();

        Materias.agregar("Matematicas");
        Materias.agregar("Español");
        Materias.agregar("Fisica");
        Materias.agregar("Biologia");

        Materias.imprimir();

        String Busqueda = "Historia";
        System.out.println("Busqueda: "+ Busqueda);

        if(Materias.contiene(Busqueda) ){
            System.out.println("Encontrada");
        }else{
            System.out.println("No encontrada");
        }

    

    }
    
}
