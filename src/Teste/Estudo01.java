package Teste;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Estudo01 {
    public static void main(String[] args) {
        // Convertendo Cº para Fº
        //(0 °C × 9/5) + 32 = 32 °F
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor em Cº a ser convertido para Fº: ");
        double valor = entrada.nextDouble();
        entrada.close();
        double valorConvertido = (valor * 9/5) + 32;
        System.out.println("O valor " + valor + "Cº em Fº é de " + valorConvertido);
    }
}
