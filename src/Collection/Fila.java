package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> Adicionam elementos na fila
        //A diferença é o comportamento quando a fila está cheia.
        fila.add("Ana"); //Lança uma exceção.
        fila.offer("Bia");  // Retorna false
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); //Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Retorna uma exceção
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll()); //Retorna o primeiro elemento da fila e o remove da fila.
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); //Retorna nulo se a lista estiver vazia.

    }
}
