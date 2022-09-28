package Teste;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String dia = entrada.next();


        if(dia.equals("Domingo")){
            System.out.println("O Domingo é o 1º dia da semana!!");
        }else if(dia.equals("Segunda")){
            System.out.println("Segunda é o 2º dia da semana!!");
        }else if (dia.equals("Terça")){
            System.out.println("Terça é o 3º dia da semana!!");
        }else if(dia.equals("Quarta")){
            System.out.println("Quarta é o 4º dia da semana!!");
        }else if(dia.equals("Quinta")){
            System.out.println("Quinta é o 5º dia da semana!!");
        }else if(dia.equals("Sexta")){
            System.out.println("Sexta é o 6º dia da semana!!");
        }else if(dia.equals("Sábado")){
            System.out.println("Sábado é o 7º dia da semana!!");
        }else{
            System.out.println("O valor digitado não é válido... Sinto muito.");
        };
        entrada.close();
}}
