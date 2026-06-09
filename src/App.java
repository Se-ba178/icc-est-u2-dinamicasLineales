import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkList();
        runQueue();
        runStack();
        
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String texto = "COMPUTACION";
        String textoInvertido = ejercicio1.invertString(texto);
        System.out.println(textoInvertido);

    }
    private static void runStack() {
        Stack <String> pila = new Stack<>();
        ArrayDeque <String> pila2 = new ArrayDeque<>();

        pila.push("Jose");
        pila.push("Andres");
        pila.push("Ana");
        pila.push("Maria");
        pila.push("Maria2");

        System.out.println(pila.isEmpty());
        System.out.println(pila.size());
        System.out.println(pila.peek());
        System.out.println(pila.size());

        System.out.println(pila.pop());
        System.out.println(pila.size());

        while(!pila.isEmpty()){
            String cliente = pila.pop();
            System.out.println("Sale -->" + cliente);

        }
        System.out.println(pila.size());//0

        

        
    }
    private static void runQueue(){
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Juan");
        cola.offer("Andres");
        cola.offer("Ana");

        System.out.println(cola.isEmpty());
        System.out.println(cola.peek());//-->Size "Jose"
        System.out.println(cola.size());// -->tres
        System.out.println(cola.poll());//--> jose saca
        System.out.println(cola.size());//--> Andres , Ana

        while(!cola.isEmpty()){
            String cliente = cola.poll();

            System.out.println("Atendi" + cliente);
        }



    }

    private static void runLinkList(){

        LinkedList <String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("pedro");
        nombres.add("Maria");
        nombres.add("Diago");
        nombres.add("Mateo");

        String  primero = nombres.getFirst();
        System.out.println(primero);
        System.out.println(nombres.get(4));// O(n) 
        System.out.println(nombres.get(nombres.size() -1 ));

        System.out.println(nombres.pop());
        System.out.println(nombres.size());//4 elementos



    }
        
}
