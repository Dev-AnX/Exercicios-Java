package com.exerciciosjava.condicionais;

import java.util.Scanner;

public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade > 18  && idade <= 65) {

            System.out.println("Digite sua Renda: ");
            double renda = sc.nextDouble();
            System.out.println("Digite o valor desejado para o Emprestimo: ");
            double emprestimo = sc.nextDouble();

            double vlrParcelas = emprestimo/10;
            double rendaPorcentagem = renda * ((double) 30 /100);

            if (vlrParcelas <= rendaPorcentagem) {
                System.out.println("Emprestimo Aprovado");
                System.out.println("O valor das parcelas são de: R$"+vlrParcelas+" em 10x");
            } else {
                System.out.println("Emprestimo Reprovado. Valor das parcelas ultrapassam 30% do valor da renda mensal");
                System.out.println("Valor das parcelas: R$"+vlrParcelas);
                System.out.println("30% da renda mensal: R$"+rendaPorcentagem);
            }
        } else {
            System.out.println("Idade fora da margem para aprovação.");
        }

    }
}
