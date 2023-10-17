package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void exibeVetor(int[] v){
        for(int i=0; i < v.length; i++){
            System.out.println("vetor[" + i + "]= " + v[i]);
        }
    }

    public static void main(String[] args) {
        // Criação do objeto leitor
        Scanner leitor = new Scanner(System.in);

        // Deleclaração e criação de um vetor de tamanho 5
        int[] vetor = new int[5];

        // Declaração e criação de um vetor já inicializado com valores
        int[] vet2 = {100, 200, 300, 400, 500, 600, 700};

        // Declaração e criação de um vetor de Strings
        String[] vet3 = new String[4];

        //Preencher os valores do vetor
        for (int i=0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

        // System.out.println(Arrays.toString(vetor));

        // Preenchendo o vetor com valores digitados pelo usário
        for(int i=0; i < vetor.length; i++){
            System.out.println("\nDigite o valor de vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        //Exibir o vetor
        System.out.println("\nValor do vetor:");
        exibeVetor(vetor);

        //Exibir o vetor
        System.out.println("\nValor do vet2:");
        exibeVetor(vet2);

        // Preenchendo o vet3 com valores digitados pelo usário
        for(int i=0; i < vet3.length; i++){
            System.out.println("\nDigite o valor de vet3[" + i + "]");
            vet3[i] = leitor.next();
        }
    }
}
