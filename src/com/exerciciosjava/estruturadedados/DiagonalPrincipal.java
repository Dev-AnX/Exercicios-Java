package com.exerciciosjava.estruturadedados;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{11,22,33,44},{10,20,30,40},{1,2,3,4},{0,5,9,6}};
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                if (linha == coluna) {
                    System.out.printf("%2d ", matriz[linha][coluna]);
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

    }
}
