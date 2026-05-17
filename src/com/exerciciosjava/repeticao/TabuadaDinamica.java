package com.exerciciosjava.repeticao;

import java.util.Scanner;

public class TabuadaDinamica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para a tabuada: ");
        int numero = input.nextInt();
        System.out.println("--------------- TABUADA ----------------");

        for (int i = 0; i <= 10; i++) {
            int tab = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, tab);
        }
        input.close();
    }
}
