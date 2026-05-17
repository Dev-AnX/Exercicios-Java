package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class InversaoDeVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        int[] vetorInverso = new int[5];
        int inversoInicial = vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor: ");
            vetor[i] = input.nextInt();
            vetorInverso[(inversoInicial-1)] = vetor[i];
            inversoInicial -=1;
        }
        System.out.println("------------------------------");
        System.out.println("-------- VETOR INICIAL -------");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
        System.out.println("-------- VETOR INVERSO -------");
        for (int i = 0; i < vetorInverso.length; i++) {
            System.out.print(vetorInverso[i] + " ");
        }
        input.close();
    }
}
