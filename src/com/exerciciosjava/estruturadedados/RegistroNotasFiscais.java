package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class RegistroNotasFiscais {
    public static void main(String[] args) {
        double[] notasFiscais = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notasFiscais.length; i++) {
            System.out.printf("Digite o valor %dª da nota fiscal: R$ ",i+1);
            notasFiscais[i] = sc.nextDouble();
        }
        System.out.println("------------------------------");
        for (int i = 0; i < notasFiscais.length; i++) {
            System.out.println("O valor da "+ (i+1) +"ª nota fiscal é de: R$ "+(notasFiscais[i]));
        }
        sc.close();
    }
}
