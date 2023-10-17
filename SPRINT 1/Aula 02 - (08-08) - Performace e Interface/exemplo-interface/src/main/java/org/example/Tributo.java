package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    private List <Tributavel> listaTrib;

    public Tributo() {
        this.listaTrib = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t){
        listaTrib.add(t);
    }

    public Double calculaTotalTributo(){
        Double totalTributo = 0.0;

        for (Tributavel t : listaTrib){
            totalTributo += t.getValorTributo();
        }
        return totalTributo;
    }

    public void exibeTodos(){
        for (Tributavel t : listaTrib){
            System.out.println(t);
        }
    }
}
