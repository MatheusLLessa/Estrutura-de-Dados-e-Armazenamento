package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vilao> lista = new ArrayList<>() {
        };

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar um Vilão");
            System.out.println("2 - Exibir Vilões Cadastrados");
            System.out.println("3 - Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o ID do Vilão: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Informe o nome do Vilão: ");
                    String nome = scanner.nextLine();
                    System.out.print("Informe a idade do Vilão: ");
                    int idade = scanner.nextInt();
                    System.out.print("Informe o poder do Vilão: ");
                    double poder = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Informe o objetivo do Vilão: ");
                    String objetivo = scanner.nextLine();
                    System.out.print("O Vilão foi capturado? (true/false): ");
                    boolean capturado = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Informe o arquiInimigo do Vilão: ");
                    String arquiInimigo = scanner.nextLine();

                    Vilao vilao = new Vilao(10, id, nome, idade, poder, objetivo, capturado, arquiInimigo);
                    lista.add(vilao);
                    break;
                case 2:
                    System.out.println("\nLista de Vilões Cadastrados:");
                    System.out.println("ID Nome Idade Poder Objetivo Capturado  ArquiInimigo");
                    for (int i = 0; i < lista.size(); i++) {
                        Vilao vilaoCadastrado = lista.get(i);
                        System.out.println(String.format("%-5d %-20s %-5d %-10.2f %-15s %-10b %-20s",
                                vilaoCadastrado.getId(), vilaoCadastrado.getNome(),
                                vilaoCadastrado.getIdade(), vilaoCadastrado.getPoder(),
                                vilaoCadastrado.getObjetivo(), vilaoCadastrado.isCapturado(),
                                vilaoCadastrado.getArquiInimigo()));
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

}