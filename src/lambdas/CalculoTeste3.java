package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> soma = (x, y) ->{return x + y;};
        System.out.println(soma.apply(2.0,5.0));

        soma = (x, y) -> x * y;
        System.out.println(soma.apply(2.0,5.0));

        BinaryOperator<Integer> soma2 = (x, y) ->{return x + y;};
        System.out.println(soma2.apply(2,5));

        soma2 = (x, y) -> x * y;
        System.out.println(soma2.apply(2,5));

    }
}
