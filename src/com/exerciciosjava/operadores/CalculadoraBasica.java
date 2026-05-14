package com.exerciciosjava.operadores;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = input.nextInt();
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int resto = num1 % num2;
        System.out.println("O resultado da soma de "+num1+" e "+num2+" é de: "+soma);
        System.out.println("O resultado da subtração de "+num1+" e "+num2+" é de: "+sub);
        System.out.println("O resultado da multiplicação de "+num1+" e "+num2+" é de: "+mult);
        System.out.println("O resultado da divisão de "+num1+" e "+num2+" é de: "+div);
        System.out.println("O resultado do resto da divisão de "+num1+" e "+num2+" é de: "+resto);

        input.close();
    }
}