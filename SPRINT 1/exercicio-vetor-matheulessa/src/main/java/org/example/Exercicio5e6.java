package org.example;

import java.util.Scanner;

public class Exercicio5e6 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorKm = new Scanner(System.in);

        String[] vetoresCarros = new String[5];
        int[] vetoresKm = new int[5];

        for (int i = 0; i < vetoresCarros.length; i++) {
            System.out.println("Digite o nome de um carro");
            vetoresCarros[i] = leitor.nextLine();
        }

        for (int j = 0; j < vetoresCarros.length; j++) {
            System.out.println("Digite na ordem quanto cada carro roda com um litro: " + vetoresCarros[j]);
            vetoresKm[j] = leitorKm.nextInt();
        }
        int maior = 0;

        for (int i = 0; i < vetoresKm.length; i++) {
            if (vetoresKm[i] > vetoresKm[maior]) {
                maior = i;
            }
        }
        System.out.println("O caro com o melhor rendimento é o " + vetoresCarros[maior] + " Com o rendimento de " + vetoresKm[maior]);

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia (1-31): ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês (1-12): ");
        int mes = scanner.nextInt();

        if (mes < 1 || mes > 12 || dia < 1 || dia > diasPorMes[mes - 1]) {
            System.out.println("Data inválida!");
        } else {
            int diaDoAno = dia;
            for (int i = 0; i < mes - 1; i++) {
                diaDoAno += diasPorMes[i];
            }
            System.out.println("O dia " + dia + "/" + mes + " corresponde ao dia " + diaDoAno + " do ano.");
        }

        scanner.close();
    }
}

