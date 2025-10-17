
public class SinglyLinkedList {

    Node head;

    public void add(int data){//Creación de un nuevo nodo
        Node newNode = new Node(data); //Verificación de lista vacia
        if(head == null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next !=null){//Recorrido de los odos, hasta encontrar el ultimo
            current=current.next;
        }
        current.next=newNode; //Insertar nuevo nodo

    }

    public boolean contains(int data){

        Node current = head;

        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(int data){
        if(head == null){//pregunta si la lista esta vacia 
            return;
        }
        if(head.data==data){//valiuda que el dato este en el head
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data !=data){//Recorrer hasta encontrar el valor
          current=current.next;
        }

        current.next = current.next.next;

    }

    public void printList(){
        Node current= head;
        while(current != null){
            System.out.println(current.data);
            current =current.next;
        }
        System.out.println("null");
    }

    public int Contador(int data) {
    int count = 0;
    Node current = head;

    while (current != null) {
        if (current.data == data) {
            count++;
        }
        current = current.next;
    }

    return count;
}
}