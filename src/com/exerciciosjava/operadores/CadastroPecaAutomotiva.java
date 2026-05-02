package com.exerciciosjava.operadores;

import java.util.Scanner;

public class CadastroPecaAutomotiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do Peça:");
        String nomePeca = input.nextLine();
        System.out.println("Digite o código do Peça:");
        int codigoPeca = input.nextInt();
        input.nextLine();
        System.out.printf("Peça código %d e nome %s cadastrada no sistema", codigoPeca, nomePeca);
        input.close();
    }
}
