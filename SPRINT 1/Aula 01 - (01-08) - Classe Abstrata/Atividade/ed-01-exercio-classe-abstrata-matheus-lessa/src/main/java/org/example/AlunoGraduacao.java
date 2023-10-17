package org.example;

public class AlunoGraduacao extends Aluno{
    private Double nota01;
    private Double nota02;

    public AlunoGraduacao(Integer ra, String nome, Double nota01, Double nota02) {
        super(ra, nome);
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    @Override
    public Double calculaMedia() {
        Double media = ((nota01 * 0.4) + (nota02 * 0.6));
        return media;
    }

    @Override
    public String toString() {
        return "\nAlunoGraduacao " +
                " \nnota01=" + nota01 +
                " \nnota02=" + nota02 + "\n"+ super.toString();
    }
}
