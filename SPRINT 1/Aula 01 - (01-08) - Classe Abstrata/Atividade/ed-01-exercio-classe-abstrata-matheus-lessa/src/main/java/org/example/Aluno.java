package org.example;

public abstract class Aluno {
    // Atributos
    private Integer ra;
    private String nome;

    // Construtor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    // Getter ra

    public Integer getRa() {
        return ra;
    }

    // Método
    public abstract Double calculaMedia();

    // toString()

    @Override
    public String toString() {
        return "Aluno\n" +
                "ra: " + ra +
                "\nnome=" + nome;
    }
}
