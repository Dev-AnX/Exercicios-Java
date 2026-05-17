package com.exerciciosjava.repeticao;

import java.util.Scanner;

public class BloqueioSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String senha = "java123";

        System.out.println("Digite a senha: ");
        String senhaDig = input.nextLine();

        while(!senha.equals(senhaDig)){
            System.out.println("Senha incorreta");
            System.out.println("Digite a senha novamente: ");
            senhaDig = input.nextLine();
        }
        System.out.println("Acesso permitido");


    }
}
