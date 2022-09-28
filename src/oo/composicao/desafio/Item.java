package oo.composicao.desafio;

public class Item {

    //Relação com um unico produto
    final Produto produto;
    final int quantidade;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
