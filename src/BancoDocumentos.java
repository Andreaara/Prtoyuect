import java.util.ArrayDeque;
import java.util.Queue;

public class BancoDocumentos {

    public static void main(String[] args) {
        
        Queue<Cliente> queue = new ArrayDeque<>();

        Cliente c1 = new Cliente(1,"Juanito");
        c1.addDocument("Doc 1");

        Cliente c2 = new Cliente(2, "Juanita");
        c2.addDocument("DOC 2");
        c2.addDocument("Doc 3");

        Cliente  c3 = new Cliente(3,"Pedro");
        c3.addDocument("Doc 4");
        c3.addDocument("Doc 5");


        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);

        for (Cliente c : queue){
            System.out.println("Cliente es atención: " + c.name + queue.poll());
            System.out.println("Documentos retirados: "+ c.docs);
            System.out.println("Cola restante: "+ queue.peek());

        }


    }
    
}
