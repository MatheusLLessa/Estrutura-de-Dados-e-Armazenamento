package org.example;

public class Perfume extends Produto{
    private String franquia;

    public Perfume(Integer codigo, String descricao, Double preco, String franquia) {
        super(codigo, descricao, preco);
        this.franquia = franquia;
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "franquia='" + franquia + '\'' +
                "} " + super.toString();
    }
}
