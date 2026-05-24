package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class SeparadorDePares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numerosIniciais = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contPares = 0;
        int contImpares = 0;

        for (int i = 0; i < numerosIniciais.length; i++) {
            System.out.println("Digite um numeros: ");
            numerosIniciais[i] = input.nextInt();
            if (numerosIniciais[i] % 2 == 0) {
                pares[contPares] = numerosIniciais[i];
                contPares++;
            } else {
                impares[contImpares] = numerosIniciais[i];
                contImpares++;
            }
        }
        System.out.println("-----------Pares-----------");
        for (int i = 0; i < contPares; i++) {
            System.out.println(pares[i]);
        }
        System.out.println("-----------Impares-----------");
        for (int i = 0; i < contImpares; i++) {
            System.out.println(impares[i]);
        }
    }
}
