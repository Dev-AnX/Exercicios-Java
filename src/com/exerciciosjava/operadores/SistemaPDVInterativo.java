package com.exerciciosjava.operadores;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaPDVInterativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do Operador do Caixa: ");
        String nomeCaixa = input.nextLine();

        System.out.println("Digite o nome do Primeiro Produto: ");
        String nomeProd1 = input.nextLine();

        System.out.println("Digite a Quantidade do Primeiro Produto: ");
        int quantidadeProd1 = input.nextInt();

        System.out.println("Digite o preço do Primeiro Produto: ");
        double precoProd1 = input.nextDouble();

        input.nextLine();

        System.out.println("Digite o nome do Segundo Produto: ");
        String nomeProd2 = input.nextLine();

        System.out.println("Digite a Quantidade do Segundo Produto: ");
        int quantidadeProd2 = input.nextInt();

        System.out.println("Digite o preço do Segundo Produto: ");
        double precoProd2 = input.nextDouble();

        input.nextLine();

        double subTotalProd1 = precoProd1 * quantidadeProd1;
        double subTotalProd2 = precoProd2 * quantidadeProd2;
        double valorTotal = subTotalProd1 + subTotalProd2;
        int qtdTotal = quantidadeProd1 + quantidadeProd2;
        boolean isCompraAtacado = (valorTotal > 200.00) || (qtdTotal > 10);

        System.out.println("---------- Cupom Fiscal -------------");
        System.out.println("Operador: " + nomeCaixa);
        System.out.println("Primeiro Produto: " + nomeProd1);
        System.out.println("Preço do Produto: " + precoProd1);
        System.out.println("Quantidade do Produto: " + quantidadeProd1);
        System.out.println("Subtotal: R$ "+subTotalProd1);
        System.out.println("Segundo Produto: " + nomeProd2);
        System.out.println("Quantidade do Produto: " + quantidadeProd2);
        System.out.println("Subtotal: R$ "+subTotalProd2);
        System.out.println("Compra em Atacado? "+isCompraAtacado);
        System.out.println("Valor total: R$ "+valorTotal);
        System.out.println("--------------------------------");


    }
}
