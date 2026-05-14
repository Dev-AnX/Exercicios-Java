package com.exerciciosjava.condicionais;

import java.util.Scanner;

public class MenuFastFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MENU DE FAST FOOD ---");
        System.out.println("1 - Hambúrguer");
        System.out.println("2 - Pizza");
        System.out.println("3 - Salada");
        System.out.print("Digite qual opção desejada: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Hambúrguer escolhido. Preço de R$ 29,90");
                break;
            case 2:
                System.out.println("Pizza escolhida. Preço de R$ 59,90");
                break;
            case 3:
                System.out.println("Salada escolhida. Preço de R$ 45,90");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }

    }
}
