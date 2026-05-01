package com.exerciciosjava.operadores;

import java.util.Scanner;

public class ValidadorEstoque {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a quantidade de produtos atuais?");
        int qtdProduto =  input.nextInt();
        System.out.println("Qual a quantidade minima aceitavel?");
        int qtdMinima = input.nextInt();
        System.out.println("Qual o preco do produto: ");
        double precoProduto = input.nextDouble();
        double valorTotalEstoque = precoProduto * qtdProduto;
        boolean alertaReposicao = (qtdProduto < qtdMinima);
        System.out.println("Precisa repor estoque? "+alertaReposicao+" (True para sim e False para nao) Valor Total do Estoque: R$ "+valorTotalEstoque);
    }
}
