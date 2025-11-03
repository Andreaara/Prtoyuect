
public class Main {
    public static void main(String[] args) {

        ArrayQueue<Customer> queue = new ArrayQueue<>();

        queue.addqueue(new Customer(1, "Alonso"));
        queue.addqueue(new Customer(2, "Bob"));
        queue.addqueue(new Customer(3, "Carlos"));
        queue.addqueue(new Customer(4, "David"));
        queue.addqueue(new Customer(5, "Jack"));
        queue.addqueue(new Customer(6, "John"));

     System.out.println("Lista normal");
        queue.print();

        System.out.println("-------------------------");
        System.out.println("Lista invertida");
        queue.reverse();
        queue.print();


    }
}