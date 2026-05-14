package com.exerciciosjava.operadores;

import java.util.Scanner;

public class InscricaoCampeonato {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do Lutador: ");
        String nome = input.nextLine();
        System.out.println("Digite a idade do Lutador: ");
        int idade = input.nextInt();
        System.out.println("Digite o peso do Lutador: ");
        double peso = input.nextDouble();
        boolean isCategoriaPesadoAdulto = (peso >= 90) && (idade >= 18);
        System.out.printf("O lutador %s pesando %.2f kg e com a idade de %d anos %b competir (true para pode competir e false para nao pode competir)", nome, peso, idade, isCategoriaPesadoAdulto);

        input.close();
    }
}
