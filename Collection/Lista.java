package Collection;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1); //Inserindo após criação
        lista.add(new Usuario("Carlos")); //Criando usuário direto na inserção
        lista.add(new Usuario("Lia")); //Criando usuário direto na inserção
        lista.add(new Usuario("Bia")); //Criando usuário direto na inserção
        lista.add(new Usuario("Manu")); //Criando usuário direto na inserção

        System.out.println(lista.get(3)); //Implementado método toString para impressão correta do objeto.

        System.out.println(lista.remove(1));  //Remoção pelo índice, retorna o objeto inves de true/false
        System.out.println(lista.remove(new Usuario("Manu")));

        System.out.println("Tem? :" + lista.contains(new Usuario("Lia")));

        for(Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
