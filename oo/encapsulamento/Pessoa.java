package oo.encapsulamento;

public class Pessoa {

    private String sobrenome;
    private String nome;
    private int idade;

    public Pessoa (String nome, String sobrenome, int idade){
        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }
    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 &&novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return getNome() + " " +getSobrenome();
    }
}
