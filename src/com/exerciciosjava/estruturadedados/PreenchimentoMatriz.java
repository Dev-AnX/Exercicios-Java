package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class PreenchimentoMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("O valor da matriz em forma de tabela é: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
