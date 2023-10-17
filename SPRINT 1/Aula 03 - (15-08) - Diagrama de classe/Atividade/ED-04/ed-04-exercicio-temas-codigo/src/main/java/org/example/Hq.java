package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hq {
    private List<Personagem> personagems;

    public Hq(){
        this.personagems = new ArrayList<>();
    }

    public void adcionarPersonagem(Personagem p){
        personagems.add(p);
        System.out.println("Personagem adicionado");
    }

    public Double calcPoder(){
        Double total = 0.0;
        for (Personagem p : personagems){
            total += p.calcularForcaTotal();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        if(personagems.isEmpty()){
            System.out.println("\nHQ vazio.");
        }else{
            System.out.println("\nPersonagem na lista");
            for (Personagem p : personagems){
                System.out.println(p);
            }
        }
    }
}
