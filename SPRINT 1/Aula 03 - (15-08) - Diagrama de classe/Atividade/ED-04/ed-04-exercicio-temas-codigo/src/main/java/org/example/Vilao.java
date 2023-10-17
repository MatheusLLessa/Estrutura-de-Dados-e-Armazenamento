package org.example;

public class Vilao extends Personagem implements iBuff{
    private Integer nivelPoder;
    private Integer nivelDefesa;

    public Vilao(Integer nivelPoder, Integer nivelDefesa) {
        this.nivelPoder = nivelPoder;
        this.nivelDefesa = nivelDefesa;
    }

    @Override
    public Integer getNivelPoder() {
        return nivelPoder;
    }

    @Override
    public void setNivelPoder(Integer nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    @Override
    public Integer getNivelDefesa() {
        return nivelDefesa;
    }

    @Override
    public void setNivelDefesa(Integer nivelDefesa) {
        this.nivelDefesa = nivelDefesa;
    }

    @Override
    public Double calcularForcaTotal() {
        return (double) (getNivelDefesa() * getNivelPoder()) / 3;
    }


    @Override
    public Double buffarPersonagem() {
        return (double) (getNivelPoder() + 2);
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "nivelPoder=" + nivelPoder +
                ", nivelDefesa=" + nivelDefesa +
                "} " + super.toString();
    }
}
