package br.com.estudo.cm;

import br.com.estudo.cm.modelo.Tabuleiro;
import br.com.estudo.cm.visao.TabuleiroConsole;

public class aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    }
}
