package DesafiosAleatorios;

import java.util.Scanner;

public class ex02 {
    /*
    Informar um saldo e imprimir o saldo com reajuste de 1%.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double saldo = entrada.nextDouble();
        System.out.println("O salário informado é de: " + saldo);
        System.out.println("Este salário reajustado em 1% é de: " + (saldo * 1.01));
    }
}
