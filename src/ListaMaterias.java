import java.util.ArrayList;
import java.util.List;

public class ListaMaterias {

    List <String> Materia = new ArrayList<>();

    public void agregar(String Materia){
        this.Materia.add(Materia);
    }

    public boolean contiene (String Materia){

        return this.Materia.contains(Materia);
    }

    public void imprimir(){
        System.out.println("Materias: " + Materia);

    }
    
}
