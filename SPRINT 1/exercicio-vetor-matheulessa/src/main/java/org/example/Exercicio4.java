package org.example;

import java.util.Scanner;

public class Exercicio4 {
    public static void exibeValor(int[] v4) {
        for (int i = 0; i < v4.length; i++) {
            System.out.print("Vetor{" + i + "]" + v4[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite 10 números inteiros:");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Valores digitados:");
        exibeValor(vetor);

        System.out.println("Digite um número qualquer: ");
        int buscaNumero = leitor.nextInt();

        int ocorrencias = 0;
        for (int valor: vetor){
            if (valor == buscaNumero){
                ocorrencias ++;
            }
        }
        if (ocorrencias > 0){
            System.out.println("O número " + buscaNumero + " ocorre " + ocorrencias + " vezes.");
        } else {
            System.out.println("O número " + buscaNumero + " não ocorre nenhuma vez.");
        }
    }
}
