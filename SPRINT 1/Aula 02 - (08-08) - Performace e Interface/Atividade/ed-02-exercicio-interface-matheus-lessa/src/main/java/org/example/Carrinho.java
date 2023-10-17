package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List <Vendavel> cart;

    public Carrinho(){
        this.cart = new ArrayList<>();
    }

    public void adicionaVendavel(Vendavel t){
        cart.add(t);
        System.out.println("Item adicionado ao carrinho");
    }

    public Double calculaTotalVenda(){
        Double total = 0.0;
        for (Vendavel t : cart){
            total += t.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        if(cart.isEmpty()){
            System.out.println("\nO carinho está vazio.");
        }else{
            System.out.println("\nItens no carrinho");
            for (Vendavel t : cart){
                System.out.println(t);
            }
        }
    }
}
