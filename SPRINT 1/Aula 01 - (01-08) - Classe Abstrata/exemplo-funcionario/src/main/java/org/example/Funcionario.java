package org.example;

abstract public class Funcionario {

    // Atributos
    private String cpf;
    private String nome;

    // Construtor
    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Métodos
    /* Método abstrato calcSlario */
    public abstract Double calcSalario();

    /* Método toString() */

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf = " + cpf + '\'' +
                ", nome = " + nome + '\'' +
                ", salario= " + String.format("R$ %.2f" , calcSalario()) +
                '}';
    }
}
