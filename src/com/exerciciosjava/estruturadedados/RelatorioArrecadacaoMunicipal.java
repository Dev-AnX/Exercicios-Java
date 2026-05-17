package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class RelatorioArrecadacaoMunicipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tributos = new String[]{"ISS", "IPTU", "ITBI", "CIP", "Coleta de Lixo" };
        double[] notasFiscais = new double[5];
        double valorTotal = 0;
        double maiorValor = 0;
        int indiceMaior = 0;

        for (int i = 0; i < tributos.length; i++) {
            System.out.printf("Qual foi o valor arrecadado para o imposto %s?\n", tributos[i]);
            notasFiscais[i] = input.nextDouble();
        }

        for (int i = 0; i < notasFiscais.length; i++) {
            valorTotal += notasFiscais[i];
            if (notasFiscais[i] > maiorValor) {
                maiorValor = notasFiscais[i];
                indiceMaior = i;
            }
        }

        for (int i = 0; i < tributos.length; i++) {
            System.out.printf("Imposto: %s - R$ %.2f\n", tributos[i], notasFiscais[i]);
        }
        System.out.println("Valor total: " + valorTotal);
        System.out.printf("Maior valor Arrecadado: R$ %.2f - %s", maiorValor, tributos[indiceMaior]);
    }
}
