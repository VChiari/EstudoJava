package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        //Imprimindo lista com for
        //for (int i = 0; i < aprovados.size(); i++){
        //    System.out.println(aprovados.get(i));
        //}

        //Imprimindo lista com forEach
        System.out.println("\nUsando ForEach");
        for(String nome : aprovados){
            System.out.println(nome);
        }

        //Utilizando Iterator
        System.out.println("\nUsando Iterator...");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Usando Streams
        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //Laço interno
    }
}
