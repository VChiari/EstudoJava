package streams;

public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media().adicinar(8.3).adicinar(6.7);
        Media m2 = new Media().adicinar(7.9).adicinar(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());

    }
}
