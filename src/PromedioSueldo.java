import java.util.ArrayList;
import java.util.List;

public class PromedioSueldo {
    public static void main(String[] args) throws Exception {
        double sueldo = 0;
        double cantidad = 0;

        List<Worker> trabajadores = new ArrayList<>();

        trabajadores.add(new Worker(1,"Cesar",2000));
        trabajadores.add(new Worker(2,"Daniel",200));
        trabajadores.add(new Worker(3,"Sebastian",50));
        trabajadores.add(new Worker(4,"Emiliano",60));
        trabajadores.add(new Worker(5,"Edgar",2000));
        trabajadores.add(new Worker(6,"Jose",70));


        for(Worker trabajador : trabajadores){
            System.out.println(trabajador);
        }

        for(Worker trabajador : trabajadores){
            sueldo += trabajador.getSueldo();
            cantidad++;
        }

        System.out.println("El Sueldo promedio es de: " + sueldo / cantidad);

        for(Worker trabajador : trabajadores){
            if(trabajador.getSueldo() <= 1000){
                trabajadores.remove(trabajador);
            }else {
                System.out.println("Lista actualizada: " + trabajadores);
            }
        }




    }
}
  