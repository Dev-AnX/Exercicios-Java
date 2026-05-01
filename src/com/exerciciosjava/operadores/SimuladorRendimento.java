package com.exerciciosjava.operadores;

import java.util.Scanner;

public class SimuladorRendimento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos reais você deseja investir inicialmente?: ");
        double cdb = input.nextDouble();
        double rendimento = 0.10;
        double cdbRendido = rendimento*cdb;
        double cdbPositivo = cdb + 500;
        double cdbTotal = cdb + cdbRendido;
        boolean rendeuBem = (cdbRendido >= cdbPositivo);
        System.out.printf("O valor investido foi de %.2f reais. O valor do rendimento é de %.2f. O valor do rendimento final é de %.2f e o valor minimo para render bem é de %.2f, então seu rendimento %b compensou (true para compensou e false para nao compensou). CDB Total: R$ %.2f", cdb, rendimento, cdbRendido, cdbPositivo, rendeuBem, cdbTotal);
    }
}
