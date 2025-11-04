public class ArrayStack<T> implements IStack<T> {

        private Object[] data;
        private int top; //top = 0

        //Constructor 1
        public ArrayStack(){
            this(100);//invoca al constructor 2

        }

        //Constructor 2
        public ArrayStack(int initialCapacity){
            this.data = new Object[initialCapacity];
            this.top = 0;
        }

        @Override
        public void push(T element) {
            //nos vamos a asegurar que aun tenga espacio el array
            data[top++] = element;


        }

        @SuppressWarnings("unchecked")
        @Override
        public T pop() {
            if(isEmpty()){
                System.out.println("La pila esta vacia");
                return null;
            }
            T value = (T) data[--top];
            data[top]=null;
            return value;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T peek() {
            if(isEmpty()){
                System.out.println("La pila esta vacia");
                return null;
            }
            return (T) data[top];
        }

        @Override
        public void clear() {

        }

        @Override
        public int size() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'size'");
        }

        @Override
        public boolean isEmpty() {
            return top == 0;
        }

        @Override
        public void print() {
            StringBuilder sb = new StringBuilder();
            sb.append("[]");

            for (int i = top-1; i >=0 ; i--) {//recorre desde la punto ya que es lo primero que queremos recorrer
                sb.append(data[i]);
                if(i!=0) sb.append("->");

            }
            sb.append("]");
            System.out.println(sb.toString());
        }

    }

