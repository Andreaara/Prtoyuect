import java.util.ArrayDeque;
import java.util.Deque;


public class Stack {

    public static void main(String[] args) throws Exception {
        Deque<String> Stack = new ArrayDeque<String>();

        Stack.push("Pagina de gatos");
        Stack.push("Pagina de comida");
        Stack.push("Pagina de ventas");

        for( String stack : Stack){
            System.out.println(stack);
        }

        System.out.println("Retrocede una pagina: "+Stack.pop());
        System.out.println("Consulta de pagina: "+Stack.peek());

        Stack.push("Nueva Pagina");
        System.out.println("Contenido de paginas: "+ Stack);

    }
}
