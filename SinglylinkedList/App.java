public class App{
    public static void main(String[] args) {
        
        SinglyLinkedList lista = new SinglyLinkedList();

        lista.printList();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("----------------");
        lista.printList();
        lista.remove(3);
        System.out.println("-------------------");
        lista.printList();
        System.out.println("---------Contador-----------");

        int buscar = 2;
        int ocurrencias = lista.Contador(buscar);

        System.out.println("Ocurrencias de " + buscar + ": " + ocurrencias);
    }

    }
