public class App {
    public static void main(String[] args)  {
        
    
    DoublelinkedList list = new DoublelinkedList();
    list.printForward();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.printForward();
    System.out.println("-----ImprimIR Backward------");
    list.printBackward();

    System.out.println("------Remove--------");
    list.remove(4);
    list.printForward();

    System.out.println("-----------");



    }

    
}