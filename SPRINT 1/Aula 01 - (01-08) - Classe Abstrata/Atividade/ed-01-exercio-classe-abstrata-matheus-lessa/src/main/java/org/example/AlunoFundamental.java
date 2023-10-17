package org.example;

import org.w3c.dom.ls.LSOutput;

public class AlunoFundamental extends Aluno{
    // Atributos
    private Double nota01;
    private Double nota02;
    private Double nota03;
    private Double nota04;

    // Construtor

    public AlunoFundamental(Integer ra, String nome, Double nota01, Double nota02, Double nota03, Double nota04) {
        super(ra, nome);
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        this.nota04 = nota04;
    }

    // Métodos

    @Override
    public Double calculaMedia() {
        Double media = (nota01 + nota02 + nota03 + nota04) / 4;
        return media;
    }

    // toString()

    @Override
    public String toString() {
        return "\nAlunoFundamental:" +
                " \nnota01: " + nota01 +
                " \nnota02=" + nota02 +
                " \nnota03=" + nota03 +
                " \nnota04=" + nota04 +
                "\n"+ super.toString();
    }
}
