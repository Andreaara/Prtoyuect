
public class ArrayQueue <T>  {

    private T[] elements;
    private int front;
    private int back;
    private int size;
    private int capacity = 10;


        @SuppressWarnings("unchecked")
        public ArrayQueue() {
            elements = (T[]) new Object[capacity];
            front = 0;
            back = 0;
            size = 0;
        }

        public void addqueue(T item) {
            if (size == capacity) {
                System.out.println("Esta llena");
                return;
            }
            elements[back] = item;
            back = (back + 1) % capacity;
            size++;
        }

        public T dequeue() {
            if (size == 0) {
                return null;
            }
            T item = elements[front];
            elements[front] = null;
            front = (front + 1) % capacity;
            size--;
            return item;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }


        public void reverse() {
            if (isEmpty()) {
                return;
            }
            T item = dequeue();
            reverse();
            addqueue(item);
        }

    public void print() {
        if (size == 0) {
            System.out.println("[]");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {

            int index = (front + i) % capacity;

            sb.append(elements[index]);

            if (i < size - 1) {
                sb.append(" -> ");
            }
        }

        sb.append("]");
        System.out.println(sb.toString());
    }


}
