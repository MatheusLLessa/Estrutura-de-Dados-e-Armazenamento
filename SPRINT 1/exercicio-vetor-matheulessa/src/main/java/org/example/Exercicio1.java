package org.example;

public class Exercicio1 {
    public static void exibir(int[] v1){
        for (int i = 0; i < v1.length; i++){
            System.out.print("Vetor[" + i + "]" + v1[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetor = new int[7];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i* 7;
        }
        System.out.println("\n Valores do vetor");
        exibir(vetor);

        int[] inverso = new int[vetor.length];
        int indiceIverso = 0;

        for (int i = vetor.length - 1; i >=0; i--){
            inverso[indiceIverso++] = vetor[i];
        }
    System.out.println("\nValores em inverso");
        exibir(inverso);
    }

}
