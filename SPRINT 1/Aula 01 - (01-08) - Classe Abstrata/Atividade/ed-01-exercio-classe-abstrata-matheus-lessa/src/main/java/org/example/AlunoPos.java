package org.example;

public class AlunoPos extends Aluno{
    private Double nota01;
    private Double nota02;
    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double nota01, Double nota02, Double notaMonografia) {
        super(ra, nome);
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        Double media = (nota01 + nota02 + notaMonografia) / 3;
        return media;
    }

    @Override
    public String toString() {
        return "\nAlunoPos " +
                " \nota01=" + nota01 +
                " \nota02=" + nota02 +
                " \nnotaMonografia=" + notaMonografia +"\n"+ super.toString();
    }
}
