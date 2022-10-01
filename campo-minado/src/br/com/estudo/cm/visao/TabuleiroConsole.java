package br.com.estudo.cm.visao;

import br.com.estudo.cm.excecao.ExplosaoException;
import br.com.estudo.cm.excecao.SairException;
import br.com.estudo.cm.modelo.Tabuleiro;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo(){
        try{
            boolean continuar = true;

            while(continuar){
                cicloDoJogo();

                System.out.println("Outra partida? (S/n) ");
                String resposta = entrada.nextLine();
                if ("n".equalsIgnoreCase(resposta)){
                    continuar = false;
                } else{
                    tabuleiro.reiniciar();
                }
            }
        }catch (SairException e){
            System.out.println("Tchau!!");
        } finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try{

            while(!tabuleiro.objetivoAlcancado() ){
                //Mostre o tabuleiro
                System.out.println(tabuleiro);

                //Pegue o valor das coordenadas
                String digitado = capturarValorDigitado("Digite (x, y): ");
                //Transforme o valor da coordenada para um valor inteiro
                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim())).iterator();

                //Pegue a informação do usuário se ele que abrir ou marcar/desmarcar o campo
                digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

                //Se for 1, abre o campo. Se for 2, marca o campo
                if("1".equalsIgnoreCase(digitado)){
                    tabuleiro.abrir(xy.next(), xy.next());
                }else if("2".equalsIgnoreCase(digitado)){
                    tabuleiro.alternarMarcacao(xy.next(), xy.next());
                }
            }
            System.out.println(tabuleiro);
            System.out.println("Você ganhou!");
        }catch (ExplosaoException e){
            System.out.println(tabuleiro);
            System.out.println("Você perdeu!");
        }
    }

    //Se o usuário em algum momento de pegar o valor digitar "sair", é gerada uma excecao e o jogo encerra.
    private String capturarValorDigitado(String texto){
        System.out.print(texto);
        String digitado = entrada.nextLine();

        if("sair".equalsIgnoreCase(digitado)){
            throw new SairException();
        }
        return digitado;
    }
}
