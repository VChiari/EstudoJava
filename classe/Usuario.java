package classe;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        if (objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto; //Fazendo um casting do Objeto recebido para um objeto da classe Usuario

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

    // O Hashcode será abordado em outra aula!
}
