package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /* Método exibeVetor - recebe um vetor de inteiros e
       exibe o seu conteúdo
    */
    public static void exibeVetor(int[] v) {
        for (int i=0; i < v.length; i++) {
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Criação do objeto leitor
        Scanner leitor = new Scanner(System.in);

        // Declaração e criação de um vetor de tamanho 5
        int[] vetor = new int[5];

        // Declaração e criação de um vetor já inicializado com valores
        int[] vet2 = { 100, 200, 300, 400, 500, 600, 700 };

        // Declaração e criação de um vetor de Strings
        String[] vet3 = new String[4];

        // Preencher os valores do vetor
        for (int i=0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }

        // Exibir o vetor
        System.out.println("Valores do vetor:");
        exibeVetor(vetor);

        // Outra forma de exibir os dados do vetor
        System.out.println(Arrays.toString(vetor));

        // Preenchendo o vetor com valores digitados pelo usuário
        for (int i=0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor["+i+"]");
            vetor[i] = leitor.nextInt();
        }

        // Exibir o vetor
        System.out.println("\nValores do vetor:");
        exibeVetor(vetor);

        // Exibir o vet2
        System.out.println("\nValores do vet2:");
        exibeVetor(vet2);

        // Preenchendo o vet3 com valores digitados pelo usuário
        for (int i=0; i < vet3.length; i++) {
            System.out.println("Digite o valor de vet3["+i+"]");
            vet3[i] = leitor.next();
        }

        // Exibindo vet3
        System.out.println("\nValores de vet3:");
        for (String s : vet3) {
            System.out.print(s + "\t");
        }
        System.out.println();

        // Desafio 1
        // Exibir a soma dos valores do vetor

        for (int i = 0; i < vetor.length; i++){
            System.out.println("DIGITE O VALOR DO VETOR ["+i+"]");
            vetor[i] = leitor.nextInt();
        }
        System.out.println("\nValores digitados");
        exibeVetor(vetor);

        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        System.out.println("A soma de valores do vetor" + soma);
        // Desafio 2
        // Exibir a qunatidade de valores pares do vetor
        int numerosPares = 0;
            for(int numeroDaVez : vetor){
                if(numeroDaVez %2 == 0){
                    numerosPares++;

                }
        }
        System.out.println("Quantidade de valores pares do vetor: " + numerosPares);

        // Desafio 3
        // 1- Criar um vetor de String inicializado com os nomes dos dias da semana: "Domingo", "Segunda"
        // 2- Solicitar que o usuário digite um número de 1 a 7
        // 3- enquanto o usuário não digitar um valor válido, ficar em loop solicitando novamente
        // 4- Exibir o dia da semana correspondente, sendo 1 para Domingo, 2 para Segunda
        String[] vetSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
        int i = 0;
        int opcao = 0;
        while (i == 0){
            System.out.println("Digite um número de 1 a 7");
            opcao = leitor.nextInt();

            if(opcao >= 1 && opcao <= 7){
                System.out.println(vetSemana[opcao -1]);
                i++;
            }
        }






    }
}