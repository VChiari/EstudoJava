package Collection;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"rawtypes", "unchecked"})


public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        //HashSet não suporta tipos primitivos, haverá conversões.
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String já é objeto
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char - Character

        System.out.println(conjunto.size());

        conjunto.add("Teste");

        System.out.println(conjunto.size()); // Continuará com 5 elementos, não aceita repetição.

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.size());

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); //União entre dois conjuntos
        conjunto.retainAll(nums); //Interseção entre dois conjuntos, mantendo apenas os valores em comum
        System.out.println(conjunto);

        conjunto.clear(); //Limpa o conjunto
        System.out.println(conjunto);

    }
}
