public class DoublelinkedList {

    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void printForward(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current);
    }

    public  void printBackward(){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        while(current != null){
            System.out.println(current.data);
            current = current.prev;
        }
        System.out.println(current);
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public void duplicados(){
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                Node duplicate = current.next;
                current.next = duplicate.next;
                if (duplicate.next != null) {
                    duplicate.next.prev = current;
                }
            } else {
                current = current.next;
            }
        

    }
 }
}
