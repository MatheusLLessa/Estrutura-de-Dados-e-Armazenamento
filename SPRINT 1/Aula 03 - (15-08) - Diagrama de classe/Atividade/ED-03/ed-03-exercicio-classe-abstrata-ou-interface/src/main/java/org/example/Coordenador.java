package org.example;

public class Coordenador extends Funcionario implements Bonus{

    private Integer qtdHorasCoordenada;
    private Integer valorHoraCoordenada;

    public Coordenador(String nome, int cpf, Integer qtdHorasCoordenada, Integer valorHoraCoordenada) {
        super(nome, cpf);
        this.qtdHorasCoordenada = qtdHorasCoordenada;
        this.valorHoraCoordenada = valorHoraCoordenada;
    }

    public Integer getQtdHorasCoordenada() {
        return qtdHorasCoordenada;
    }

    public void setQtdHorasCoordenada(Integer qtdHorasCoordenada) {
        this.qtdHorasCoordenada = qtdHorasCoordenada;
    }

    public Integer getValorHoraCoordenada() {
        return valorHoraCoordenada;
    }

    public void setValorHoraCoordenada(Integer valorHoraCoordenada) {
        this.valorHoraCoordenada = valorHoraCoordenada;
    }

    @Override
    public Double getValorBonus() {
        return getQtdHorasCoordenada() * getValorHoraCoordenada() * 4.5 * 0.2 ;
    }
}
