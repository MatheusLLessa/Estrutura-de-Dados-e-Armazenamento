package org.example;

public class Engenheiro extends Funcionario{
    // Atributo
    private Double salario;

    // Contrutor

    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    // Métodos

    /* Implementação dos métodos calcSalario */
    @Override
    public Double calcSalario() {
        return salario;
    }

    // toString()
    @Override
    public String toString() {
        return "Engenheiro " +
                "salario=" + salario +
                "} " + super.toString();
    }
}
