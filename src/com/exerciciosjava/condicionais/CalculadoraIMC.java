package com.exerciciosjava.condicionais;

import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Digite o peso (kg): ");
      double peso = input.nextDouble();

      System.out.println("Digite a altura (m): ");
      double altura = input.nextDouble();

      double imc = (peso/(altura*altura));

      System.out.printf("Seu IMC é de: %.2f E vc está", imc);

      if (imc < 18.5) {
          System.out.println(" abaixo do peso ideal");
      } else if (imc >= 18.5 && imc <= 25.0) {
          System.out.println(" no peso ideal");
      } else if (imc >= 25 && imc <= 30.0) {
          System.out.println(" com Sobrepeso");
      } else if (imc >= 30) {
          System.out.println(" com Obesidade");
      }
      input.close();
  }
}
