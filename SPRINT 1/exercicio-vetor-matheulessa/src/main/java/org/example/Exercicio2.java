package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void exibir(int[] v2){
        for (int i = 0; i < v2.length; i++){
            System.out.println("Vetor["+i+"]" + v2[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor vetor [" + i + "]");
            vetor[i] = leitor.nextInt();
        }
        System.out.println("\nValores digitado");
        exibir(vetor);

        int soma = 0;
        for (int valor : vetor){
            soma += valor;
        }
        double media = (double) soma / vetor.length;
        System.out.println("A média dos números digitados: " + media);

        for (int valor : vetor){
            if (valor > media){
                System.out.println("Os Valores acima da média são: " + valor);
            }
        }
    }
}
