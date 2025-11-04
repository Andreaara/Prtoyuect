
public class Main {
    public static void main(String[] args) {

        SinglyLinkedList singly = new SinglyLinkedList();

        int data[] = {14,2,22,7,89,23};

        for (int d : data) {
            singly.add(d);
        }

        System.out.println("Lista Original:");
        singly.printList();

        SinglyLinkedList[] resultLists = singly.splitEvenOdd();
        SinglyLinkedList evenList = resultLists[0];
        SinglyLinkedList oddList = resultLists[1];

        System.out.println("\nLista de Pares:");
        evenList.printList();

        System.out.println("\nLista de Impares:");
        oddList.printList();
    }
}