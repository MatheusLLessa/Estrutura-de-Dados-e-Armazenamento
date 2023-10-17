package org.example;

public class Professor extends Funcionario implements Bonus {
    private Integer qtdAulas;
    private Integer valorHora;

    public Professor(String nome, int cpf, Integer qtdAulas, Integer valorHora) {
        super(nome, cpf);
        this.qtdAulas = qtdAulas;
        this.valorHora = valorHora;
    }

    public Integer getQtdAulas() {
        return qtdAulas;
    }

    public void setQtdAulas(Integer qtdAulas) {
        this.qtdAulas = qtdAulas;
    }

    public Integer getValorHora() {
        return valorHora;
    }

    public void setValorHora(Integer valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public Double getValorBonus() {
        return getQtdAulas() * getValorHora() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qtdAulas=" + qtdAulas +
                ", valorHora=" + valorHora +
                "} " + super.toString();
    }
}
