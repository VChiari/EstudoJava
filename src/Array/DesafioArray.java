package Array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        double soma = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas para armazenar: ");
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota a armazenar: ");
            notas[i] = entrada.nextDouble();
            System.out.println("A nota "+ (i+1) + " armazenada corresponde ao valor: " + notas[i]);
        }

        for(double nota: notas){
            soma += nota;
        }

        System.out.println("As notas armazenadas foram: " + Arrays.toString(notas));
        System.out.println("A média das notas do aluno é de: " + soma/notas.length);

    }
}
