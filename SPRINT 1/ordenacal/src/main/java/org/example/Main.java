package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Criação do vetor para inicialização do metodo SELECTION SORT
        int[] vetor1 = {4, 7, 5, 2, 8, 1, 6, 3};
        selectionSort(vetor1);

        int[] vetor2 = {4, 7, 5, 2, 8, 1, 6, 3};
        selectionSortOtimizado(vetor2);

        int[] vetor3 = {4, 7, 5, 2, 8, 1, 6, 3};
        bubbleSort(vetor3);

        int[] vetor4 = {10, 20, 30, 40, 50, 60, 70, 80};
        pesquisaBinaria(vetor4, 50);




        System.out.println("\nValores do vetor Selection Sort");
        exibeVetor(vetor1);
        System.out.println("\nValores do vetor Selection Sort Otimizado");
        exibeVetor(vetor2);
        System.out.println("\nValores do vetor Bubble");
        exibeVetor(vetor3);
        System.out.println("\nValores do vetor pesquisa Binaria");
        exibeVetor(vetor4);

    }



    public static void exibeVetor(int[] v) {
        for (int i=0; i < v.length; i++) {
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }

    }

    public static void selectionSort(int[] v){
        int comparacao = 0;
        int troca = 0;

        for(int i = 0; i < v.length - 1; i++){
            for (int j = i + 1; j < v.length; j++){
                comparacao++;
                if (v[j] > v[i]){
                    // trocar v[j] c/ [i]
                    int aux = v[i];
                    v[i] = v[j];
                    troca++;
                    v[j] = aux;
                }
            }
        }
        System.out.println("Quantidade de comparações " + comparacao);
        System.out.println("Quantidade de trocas " + troca);

    }

    public static void selectionSortOtimizado(int[] v) {
        int comparacao = 0;
        int troca = 0;

        for (int i = 0; i < v.length - 1; i++) {
            int indMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                comparacao++;
                if (v[j] > v[indMenor]) {
                    troca++;
                    indMenor = j;
                }
            }
            //trocar v[i] com v[indMenor]
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
        }
        System.out.println("Quantidade de comparação Otimizado " + comparacao);
        System.out.println("Quantidade de troca Otimizado " + troca);

    }

    public static void bubbleSort(int[] v){
        for (int i = 0; i < v.length - 1; i++){
            for (int j = 1; j < v.length - i; j++){
                if(v[j - 1] > v[j]){
                    int aux = v[j];
                    v[j] = v[j - 1];
                    v[j - 1] = aux;
                }
            }
        }
    }

    public static int pesquisaBinaria(int[] v ,int x){
        int comparacao = 0;

        int indInf = 0;
        int indSup = v.length -1;

        while (indInf <= indSup){
            int meio = (indInf + indSup) / 2;
            comparacao++;
            if (x == v[meio]){
                return meio;
            }else if (x > v[meio]){
                indInf = meio + 1;
            }else {
                indSup = meio - 1;
            }
        }
        System.out.println("Quantidade de comparação pesquisa binaria  " + comparacao);
        return -1;
    }
}

