package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class BuscaEquipamento {
    public static void main(String[] args) {
        String[] equipamentos = new String[]{
                "Roteador",
                "Switch",
                "Servidor",
                "Monitor",
                "Teclado"
        };
        Scanner input = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Digite o nome do equipamento: ");
        String nomeEquipamento = input.nextLine();

        for (int i = 0; i<equipamentos.length; i++) {
            if (equipamentos[i].equals(nomeEquipamento)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O equipamento " + nomeEquipamento + " foi encontrado.");
        } else {
            System.out.println("O equipamento " + nomeEquipamento + " não foi encontrado.");
        }
        input.close();
    }
}
