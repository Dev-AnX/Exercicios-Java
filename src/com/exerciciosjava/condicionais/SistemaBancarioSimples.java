package com.exerciciosjava.condicionais;

import java.util.Scanner;

public class SistemaBancarioSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoInicial = 1000.00;
        double saldo;

        System.out.println("-------------- SISTEMA BANCARIO SIMPLES ---------------");
        System.out.println("Digite uma opção: ");
        System.out.println("Digite 1 para consultar o saldo");
        System.out.println("Digite 2 para depositar");
        System.out.println("Digite 3 para sacar");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Saldo: R$ " + saldoInicial);
                break;
            case 2:
                System.out.println("Digite quanto deseja depositar");
                double deposita = sc.nextDouble();
                if (deposita > 0 ) {
                    saldo = saldoInicial + deposita;
                    System.out.println("----------- Comprovante de Depósito -----------");
                    System.out.println("Saldo Inicial: R$ " + saldoInicial);
                    System.out.println("Valor Depositado: R$ " + deposita);
                    System.out.println("Saldo Final: R$ " + saldo);
                } else {
                    System.out.println("Valor inválido!");
                }
                break;
            case 3:
                System.out.println("Digite quanto deseja sacar");
                double sacar = sc.nextDouble();
                if (sacar > 0 && sacar <= saldoInicial) {
                    saldo = saldoInicial - sacar;
                    System.out.println("----------- Comprovante de Saque -----------");
                    System.out.println("Saldo Inicial: R$ " + saldoInicial);
                    System.out.println("Saldo Final: R$ " + saldo);
                    System.out.println("Valor sacado: R$ " + sacar);
                }  else {
                    System.out.println("Valor inválido! Saldo negativo ou valor maior que o já presente em conta!");
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        sc.close();
    }
}
