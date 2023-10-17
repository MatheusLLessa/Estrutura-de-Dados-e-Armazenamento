package org.example;

import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        int escolha;
        boolean sair = false;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar Servico");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir total de venda");
            System.out.println("6. Fim");
            System.out.print("Escolha uma opção: ");
            escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nDigite o código do livro:");
                    Integer codigoLivro = leitor.nextInt();
                    System.out.println("\nDigite o título do livro:");
                    String tituloLivro = leitor.nextLine();
                    leitor.nextLine();
                    System.out.println("\nDigite o autor do livro:");
                    String autorLivro = leitor.nextLine();
                    System.out.println("\n Digite o isbn do livro:");
                    String isbnLivro = leitor.nextLine();
                    System.out.println("\nDigite o preço do Livro:");
                    Double precoLivro = leitor.nextDouble();
                    Livro livro = new Livro(codigoLivro, precoLivro, tituloLivro, autorLivro, isbnLivro);
                    carrinho.adicionaVendavel(livro);
                    break;
                case 2:
                    System.out.println("\nDigite o codigo do DVD");
                    Integer codigoDvd = leitor.nextInt();
                    System.out.println("\nDigite o preço do DVD:");
                    Double precoDvd = leitor.nextDouble();
                    System.out.println("\nDigite o nome do DVD:");
                    String dvdNome = leitor.nextLine();
                    leitor.nextLine();
                    System.out.println("\nDigite a gravadora do DVD:");
                    String gravadoraDvd = leitor.nextLine();
                    Dvd dvd = new Dvd(codigoDvd, precoDvd, dvdNome, gravadoraDvd);
                    carrinho.adicionaVendavel(dvd);
                    break;
                case 3:
                    System.out.printf("\nDigite o código do serviço:");
                    Integer codigoServico = leitor.nextInt();
                    System.out.println("\nDigite a descrição do serviço:");
                    String descricaoServico = leitor.nextLine();
                    System.out.printf("\nDigite quantas horas de serviço:");
                    Integer quantHoras = leitor.nextInt();
                    System.out.printf("\nDigite o valor da hora do serviço:");
                    Double valorHora = leitor.nextDouble();
                    Servico servico = new Servico(descricaoServico, codigoServico, quantHoras, valorHora);
                    carrinho.adicionaVendavel(servico);
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println("\nTotal de venda:" + carrinho.calculaTotalVenda());
                    break;
                case 6:
                    sair = true;
                    System.out.println("\nEncerrar o programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Escolha uma opção válida.");
            }
        }while (escolha !=6);

        leitor.close();
    }
}
