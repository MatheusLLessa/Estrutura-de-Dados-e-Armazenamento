package org.example;

import java.util.ArrayList;
import java.util.List;
public class Empresa {
    // Atributos
    private List <Funcionario> lista;

    // Construtor
    public Empresa(){
        lista = new ArrayList<>();
    }

    // Métodos
    public void adicionarFunc(Funcionario f) {
        lista.add(f);
    }

    public void exibeTodos(){
        System.out.println("\n Lista dos funcionarios");
        for (Funcionario f : lista){
            System.out.println(f);
        }
    }

    public void exibeTotalSalario(){
        Double total = 0.0;
        for (Funcionario f : lista){
            total += f.calcSalario();
        }
        System.out.printf("\n Total dos salarios: R$ %.2f \n", total);
    }

    public void exibeHorista(){
        System.out.println("\n Lista dos horista");

        for (Funcionario f : lista){
            if(f instanceof Horista){
                System.out.println(f);
            }
        }
    }
}
