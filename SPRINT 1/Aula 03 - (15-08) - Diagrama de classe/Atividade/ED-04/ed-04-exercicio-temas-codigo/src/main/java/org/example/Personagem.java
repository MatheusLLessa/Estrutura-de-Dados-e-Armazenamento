package org.example;

public abstract class Personagem {
    private String nome;
    private String descricao;
    private Integer nivelPoder;
    private Integer nivelDefesa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(Integer nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public Integer getNivelDefesa() {
        return nivelDefesa;
    }

    public void setNivelDefesa(Integer nivelDefesa) {
        this.nivelDefesa = nivelDefesa;
    }

    public abstract Double calcularForcaTotal();

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", nivelPoder=" + nivelPoder +
                ", nivelDefesa=" + nivelDefesa +
                '}';
    }
}
