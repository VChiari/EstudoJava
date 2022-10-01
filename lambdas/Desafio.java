package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
        1 - A partir do produto calcular o preco real (com desconto)
        2 - Imposto Municipal: >= 2500 (8,5%) / <2500 (Isento)
        3 - Frete: >= 3000 (100) / <3000 (50)
        4 - Arredondar: Deixar duas casas decimais
        5 - Formatar: R$1234,56
         */

        Produto p = new Produto("iPad", 3235.89, 0.13);

        //Calcular o precoFinal
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

        //Calcular o preço com imposto
        UnaryOperator<Double> impostoMunicipal = preco -> preco>= 2500 ? preco * 1.085 : preco;

        //Calcular o frete
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100: preco + 50;

        //Arredondar para 2 casas decimais
        UnaryOperator<Double> arredondar = preco -> Double.valueOf(Math.round(preco *100)) / 100;

        //Formatar R$1234,42
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        String preco = precoFinal.andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);
        System.out.println("O preço final é: " + preco);
    }
}
