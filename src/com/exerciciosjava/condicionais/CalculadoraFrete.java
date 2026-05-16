package com.exerciciosjava.condicionais;

import java.util.Scanner;

public class CalculadoraFrete {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double valor = sc.nextDouble();

        if (valor < 200.00) {

            System.out.println("Digite a sigla de sua região: (Ex: SP, MG, RJ)");
            String sigla = sc.next();
            sigla = sigla.toUpperCase();
            double valorComFrete = valor;

            switch (sigla) {
                case "SP":
                   valorComFrete = valor + 15.00;
                    System.out.println("Seu valor de compra mais o frete é: "+valorComFrete);
                    break;
                case "MG":
                   valorComFrete = valor + 25.00;
                    System.out.println("Seu valor de compra mais o frete é: "+valorComFrete);
                    break;
                case "RJ":
                    valorComFrete = valor + 20.00;
                    System.out.println("Seu valor de compra mais o frete é: "+valorComFrete);
                    break;
                default:
                    System.out.println("sigla de regiao invalida");
                    break;
            }

        }else{
            System.out.println("Apto a ter frete grátis");
        }
        sc.close();
    }
}
