package DesafiosAleatorios;

import java.util.Scanner;

public class ex01 {

    /*
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
    mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
    (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos anos?: ");
        int ano = entrada.nextInt();
        ano *= 365;
        System.out.println("Quantos meses?: ");
        int mes = entrada.nextInt();
        mes *= 30;
        System.out.println("Quantos dias?: ");
        int dia = entrada.nextInt();

        System.out.println("De acordo com os dados informados, você tem " + (ano + mes + dia) + " dias de vida!" );
    }
}
