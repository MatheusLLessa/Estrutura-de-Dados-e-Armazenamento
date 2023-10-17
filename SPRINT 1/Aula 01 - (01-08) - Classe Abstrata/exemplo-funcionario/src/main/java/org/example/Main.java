package org.example;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos das classes herdeiras de Funcionario
        Engenheiro e = new Engenheiro("0123456", "Matheus", 15000.0);

        Vendedor v = new Vendedor("04567", "Yago", 3000.0, 0.10);

        Horista h = new Horista("98745", "Lessa", 80, 40.0);

        Empresa sptech = new Empresa();

        sptech.adicionarFunc(e);
        sptech.adicionarFunc(v);
        sptech.adicionarFunc(h);

        sptech.exibeTodos();
        sptech.exibeHorista();
        sptech.exibeTotalSalario();
    }
}
