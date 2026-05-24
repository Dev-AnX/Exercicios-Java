package com.exerciciosjava.estruturadedados;

import java.util.Scanner;

public class MapaDeCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] cinema = new boolean[5][5];
        String linhaCadeiras = "";
        String assentoEscolhido = "";

        do {
            for (int i = 0; i < 5; i++) {
                int fila = i;
                int cadeira = 0;
                String mapa = "";
                switch (fila) {
                    case 0:
                        mapa = "A";
                        break;
                    case 1:
                        mapa = "B";
                        break;
                    case 2:
                        mapa = "C";
                        break;
                    case 3:
                        mapa = "D";
                        break;
                    case 4:
                        mapa = "E";
                        break;
                }
                for (int j = 0; j < 5; j++) {
                    cadeira = j + 1;
                    if (cinema[i][j] == false) {
                        System.out.print(" - ");
                    } else {
                        System.out.print(" X ");
                    }
                    linhaCadeiras += mapa + "" + cadeira + " ";
                }
                System.out.println();
                System.out.println(linhaCadeiras);
                linhaCadeiras = "";
                System.out.println();
            }
            System.out.println("Qual assento da sessão você deseja? (Digite qualquer coisa diferente dos assentos para sair): ");
            assentoEscolhido = sc.nextLine();
            switch (assentoEscolhido) {
                case "A1":
                    if (cinema[0][0] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[0][0] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "A2":
                    if (cinema[0][1] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[0][1] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "A3":
                    if (cinema[0][2] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[0][2] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "A4":
                    if (cinema[0][3] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[0][3] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "A5":
                    if (cinema[0][4] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[0][4] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "B1":
                    if (cinema[1][0] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[1][0] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "B2":
                    if (cinema[1][1] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[1][1] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "B3":
                    if (cinema[1][2] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[1][2] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "B4":
                    if (cinema[1][3] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[1][3] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "B5":
                    if (cinema[1][4] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[1][4] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "C1":
                    if (cinema[2][0] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[2][0] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "C2":
                    if (cinema[2][1] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[2][1] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "C3":
                    if (cinema[2][2] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[2][2] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "C4":
                    if (cinema[2][3] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[2][3] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "C5":
                    if (cinema[2][4] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[2][4] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "D1":
                    if (cinema[3][0] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[3][0] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "D2":
                    if (cinema[3][1] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[3][1] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "D3":
                    if (cinema[3][2] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[3][2] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "D4":
                    if (cinema[3][3] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[3][3] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "D5":
                    if (cinema[3][4] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[3][4] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "E1":
                    if (cinema[4][0] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[4][0] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "E2":
                    if (cinema[4][1] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[4][1] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "E3":
                    if (cinema[4][2] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[4][2] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "E4":
                    if (cinema[4][3] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[4][3] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                case "E5":
                    if (cinema[4][4] == true) {
                        System.out.println("Esse assento já está ocupado!");
                    } else {
                        cinema[4][4] = true;
                        System.out.println("Assento reservado com sucesso!");
                    }
                    break;
                default:
                    assentoEscolhido = "sair";
                    break;
            }
        } while (!assentoEscolhido.equals("sair"));
        System.out.println("Obrigado e bom filme!");
    }
}
