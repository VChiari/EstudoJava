package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data(04, 03, 1997);

        System.out.println(d1.obterDataFormatada());

        var d2 = new Data();

        System.out.printf(d2.obterDataFormatada());
    }
}
