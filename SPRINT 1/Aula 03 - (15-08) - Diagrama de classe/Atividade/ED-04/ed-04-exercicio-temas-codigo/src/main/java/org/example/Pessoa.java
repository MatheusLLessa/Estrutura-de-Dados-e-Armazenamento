package org.example;

public class Pessoa extends Personagem{
    private Integer nivelPoder;
    private Integer nivelDesefa;

    @Override
    public Integer getNivelPoder() {
        return nivelPoder;
    }

    @Override
    public void setNivelPoder(Integer nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public Integer getNivelDesefa() {
        return nivelDesefa;
    }

    public void setNivelDesefa(Integer nivelDesefa) {
        this.nivelDesefa = nivelDesefa;
    }

    public Pessoa(Integer nivelPoder, Integer nivelDesefa) {
        this.nivelPoder = nivelPoder;
        this.nivelDesefa = nivelDesefa;
    }

    @Override
    public Double calcularForcaTotal() {
        return (double) (getNivelPoder() * getNivelDesefa());
    }
}
