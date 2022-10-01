package br.com.estudo.cm.modelo;

import br.com.estudo.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;

    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;

    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    //Lógica para adicionar vizinhos e verificar se eles podem ser adicionados.
    boolean adicionarVizinho(Campo candidatoVizinho){
        boolean linhaDiferente = linha != candidatoVizinho.linha;
        boolean colunaDiferente = coluna != candidatoVizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha = Math.abs(linha - candidatoVizinho.linha);
        int deltaColuna = Math.abs(linha - candidatoVizinho.coluna);
        int deltaGeral = deltaLinha + deltaColuna;

        //Cenário para adicionar vizinho
        if(deltaGeral == 1 && !diagonal){
            vizinhos.add(candidatoVizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal) {
            vizinhos.add(candidatoVizinho);
            return true;
        } else{
            return false;
        }
    }

    //Lógica para alternar entre marcado(com flag) e desmarcado(sem flag). Campos precisam estar fechados e não abertos
    void alternarMarcacao(){
        if(!aberto){
            marcado = !marcado;
        }
    }

    boolean abrir(){
        if(!aberto && !marcado){
            aberto = true;
            if(minado){
                throw new ExplosaoException();
            }
            if(vizinhancaSegura()){
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        }else{
            return false;
        }
    }

    boolean vizinhancaSegura(){
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    public boolean isMarcado(){
        return marcado;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isMinado(){
        return minado;
    }

    void minar(){
        minado = true;
    }
    public boolean isAberto(){
        return aberto;
    }
    public boolean isFechado(){
        return !isAberto();
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }
    long minasNaVizinhanca(){
        return vizinhos.stream().filter(v -> v.minado).count();
    }
    void reiniciar(){
        aberto = false;
        minado = false;
        marcado = false;
    }
    public String toString(){
        if(marcado){
            return "x";
        }else if(aberto && minado){
            return "*";
        } else if(aberto && minasNaVizinhanca() > 0 ){
            return Long.toString(minasNaVizinhanca());
        } else if(aberto){
            return " ";
        } else{
            return "?";
        }
    }
}
