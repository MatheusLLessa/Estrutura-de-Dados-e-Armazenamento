package org.example;

import java.util.Scanner;

public class TestePersonagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Hq hq = new Hq();

        int escolha;
        boolean sair = false;

        do{
            System.out.println("Menu:");
            System.out.println("1. Adicionar Vilão");
            System.out.println("2. Heroi");
            System.out.println("3. Pessoa");
            System.out.println("4. Fim");
            System.out.print("Escolha uma opção: ");
            escolha = leitor.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("\nDigite nome do Vilão");
                    String nomeVilao = leitor.nextLine();
                    System.out.println("\nDigite a descrição do vilão");
                    String descVilao = leitor.nextLine();
                    leitor.nextLine();
                    System.out.println("\nDigite o nivel de poder");
                    Integer nivelPoder = leitor.nextInt();
                    System.out.println("\nDigite o nivel da defesa");
                    Integer nivelDefesa = leitor.nextInt();
                    Vilao vilao = new Vilao(nivelPoder,nivelDefesa);
                    break;

                case 2:
                    System.out.println("\nDigite nome do Heroi");
                    String nomeHeroi = leitor.nextLine();
                    System.out.println("\nDigite a descrição do heroi");
                    String desHeroi = leitor.nextLine();
                    leitor.nextLine();
                    System.out.println("\nDigite o nivel de poder");
                    Integer poderHeroi = leitor.nextInt();
                    System.out.println("\nDigite o nivel da defesa");
                    Integer defesaHeroi = leitor.nextInt();
                    Heroi heroi = new Heroi(poderHeroi,defesaHeroi);
                    break;

                case 3:
                    System.out.println("\nDigite nome do Pessoa");
                    String nomePessoa = leitor.nextLine();
                    System.out.println("\nDigite a descrição do pessoa");
                    String descPessoa = leitor.nextLine();
                    leitor.nextLine();
                    System.out.println("\nDigite o nivel de pessoa");
                    Integer poderPessoa = leitor.nextInt();
                    System.out.println("\nDigite o nivel da pessoa");
                    Integer defesaPessoa = leitor.nextInt();
                    Pessoa pessoa = new Pessoa(poderPessoa,defesaPessoa);
                    break;

                case 4:
                    sair = true;
                    System.out.println("\nEncerrar o programa.");
                    break;

                default:
                    System.out.println("\nOpção inválida. Escolha uma opção válida.");
            }
        }while (escolha !=4);
        leitor.close();
    }
}
