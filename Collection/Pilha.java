package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        //Pilha LIFO = Last In First Out

        livros.add("O Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); //Retorna nulo caso não ache

        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();
    }
}
