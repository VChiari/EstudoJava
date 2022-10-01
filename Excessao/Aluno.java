package Excessao;

import java.util.Objects;

public class Aluno {
    public String nome;
    public double nota;
    public boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = true;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", bomComportamento=" + bomComportamento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(aluno.nota, nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
