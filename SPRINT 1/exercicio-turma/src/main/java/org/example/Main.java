package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdTurma01 = 0;
        int qtdTurma02 = 0;
        String[] turma01 = new String[10];
        String[] turma02 = new String[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome de um aluno");
            String nome = leitor.nextLine();

            System.out.println("Digite qual a turma do ");
            String turma = leitor.nextLine();
            if (turma.equals("turma01")) {
                turma01[qtdTurma01] = nome;
                qtdTurma01++;
            }
            if (turma.equals("turma02")){
                turma02[qtdTurma02] = nome;
                qtdTurma02++;
            }
        }
        for (int j = 0; j < qtdTurma01; j++) {
            System.out.println(turma01[j]+ " ");
        }
        for (int k = 0; k < qtdTurma02; k++) {
            System.out.println(turma02[k] + " ");
        }
}
}