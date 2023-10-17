package org.example;

public class TesteTributo {
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento(1,"arroz", 20.0,5);
        Alimento alimento2 = new Alimento(2,"maçã", 5.50,6);

        Perfume perfume1 = new Perfume(2,"malbac", 55.0,"amadeirado");
        Perfume perfume2 = new Perfume(3,"quasar", 60.0,"ice");

        Servico servico1 = new Servico("logista",1100.0);
        Servico servico2 = new Servico("fornecedor",1220.0);


        Tributo tributo1 = new Tributo();

        tributo1.adicionaTributavel(alimento1);
        tributo1.adicionaTributavel(alimento2);

        tributo1.adicionaTributavel(perfume1);
        tributo1.adicionaTributavel(perfume2);

        tributo1.adicionaTributavel(servico1);
        tributo1.adicionaTributavel(servico2);

        tributo1.exibeTodos();

        System.out.printf("\nO total de tributos é R$ %.2f \n", tributo1.calculaTotalTributo());

    }
}
