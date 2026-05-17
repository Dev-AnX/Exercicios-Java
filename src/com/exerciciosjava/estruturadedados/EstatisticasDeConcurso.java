package com.exerciciosjava.estruturadedados;

public class EstatisticasDeConcurso {
    public static void main(String[] args) {
        int[] notas = new int[] {85, 90, 78, 92, 88};
        int maiorNota = notas[0];
        int menorNota = notas[0];

        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > maiorNota){
                maiorNota = notas[i];
            }
            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
        }
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
    }
}
