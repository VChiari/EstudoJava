package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial){
        this.nome = nomeInicial;
    }
    Produto(){

    }
    double precoComDesconto(){
        return preco * (1-desconto);
    }
}
