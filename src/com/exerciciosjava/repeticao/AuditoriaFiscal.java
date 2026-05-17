package com.exerciciosjava.repeticao;

import java.util.Scanner;

public class AuditoriaFiscal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorTotal = 0;
        int count = 0;

        System.out.println("-------------------- Auditoria Fiscal  ---------------------");
        System.out.println("Digite o valor do imposto (Ou digite 0 para sair): ");
        double valor = input.nextDouble();

        while (valor != 0) {
            valorTotal = valor + valorTotal;
            count++;
            System.out.println("Digite o valor do imposto (Ou digite 0 para sair): ");
            valor = input.nextDouble();
        }
        System.out.println("Valor total arrecadado: R$ "+ valorTotal);
        System.out.println("Guias válidas processadas: "+ count);
    }
}
