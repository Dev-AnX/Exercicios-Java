package com.exerciciosjava.estruturadedados;

public class SomaLinhas {
    public static void main(String[] args) {
        int valores[][] = new int[][]{{1, 2, 3}, {8, 9, 7}, {4, 5, 6}};
        int somaLinhas = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("----------------");
            System.out.println("Linha " + i);
            for (int j = 0; j < valores[i].length; j++) {
                somaLinhas += valores[i][j];
                System.out.print(valores[i][j] + " ");
            }
            System.out.println();
            System.out.println("A Soma da linha " + (i) + " é : " + somaLinhas);
            somaLinhas = 0;
        }
    }
}
