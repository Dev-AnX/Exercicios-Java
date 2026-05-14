package com.exerciciosjava.tiposprimitivos;

public class CalculadoraArea {
    public static void main(String[] args) {
        double raio = 5.5D;
        double pi = 3.14159;
        double area = pi * (raio * raio);
        System.out.println("A área do círculo é de: "+area);
    }
}