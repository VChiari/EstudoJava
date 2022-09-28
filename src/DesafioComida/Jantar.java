package DesafioComida;

public class Jantar {
    public static void main(String[] args) {

        Comida lasanha = new Comida("Lasanha", 1);
        Comida feijao = new Comida("Feijao", 0.2);


        Pessoa p1 = new Pessoa("João", 60);
        System.out.println(p1.nome + " esta pesando: " + p1.peso);
        p1.Comer(feijao);
        System.out.println(p1.nome + " esta pesando: " + p1.peso);
    }
}
