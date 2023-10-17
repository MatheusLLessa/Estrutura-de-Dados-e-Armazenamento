package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus{
    private List<Bonus>listaBonus;

    public ControleBonus() {
        this.listaBonus = new ArrayList<>();
    }

    public void adicionarBonus(Bonus b){
        listaBonus.add(b);
        System.out.println("Adicionado");
    }

    public void exibirTodosBonus(){
        for (Bonus b: listaBonus){
            System.out.println(b);
        }
    }

    public Double calculaTotalBonus(){
        Double total = 0.0;
        for (Bonus b: listaBonus){
            total += b.getValorBonus();
        }
        System.out.println(total);
        return total;
    }

}
