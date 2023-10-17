package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void exibir(String[] v3) {
        for (int i = 0; i < v3.length; i++) {
            System.out.print("Vetor[" + i + "]" + v3[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] vetor = new String[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite nomes: ");
            vetor[i] = leitor.next();
        }

        System.out.println("Os nomes digitados é: ");
        exibir(vetor);

        System.out.println("Digite um nome: ");
        String nome = leitor.next();

        int indiceEncontrado = -1;
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i].equals(nome));
            break;
        }

        if (indiceEncontrado != -1) {
            System.out.println("O nome está na lista! Vetor[" + indiceEncontrado + "]");
        } else {
            System.out.println("O nome não está na lista!");
        }
    }
}
