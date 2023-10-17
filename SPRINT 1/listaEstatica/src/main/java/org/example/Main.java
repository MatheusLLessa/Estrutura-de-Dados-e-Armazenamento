package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    listaEstatica lista = new listaEstatica(5);
    lista.adicionaNoInico(10);
    lista.adicionaNoInico(20);
    lista.adicionaNoInico(30);

        System.out.println("Antes da substituição: ");
        for (int i = 0; i < lista.getNroElem(); i++){
            System.out.println(lista.getElementos()[i] + " ");
        }
        System.out.println();

        boolean substituiu = lista.substitui(20, 40);
        if(substituiu){
            System.out.println("Apóss a substituição: ");
            for (int i = 0; i < lista.getNroElem(); i++){
                System.out.println(lista.getElementos()[i] + " ");
            }
            System.out.println();
        }

        int ocorrencia = lista.contaOcorrencia(30);
        System.out.println("Ocorrências de 30 na lista: " + ocorrencia);

        lista.adicionaNoInico(50);
        System.out.println("Após adicionar 50 no inicio: ");
        for (int i = 0; i < lista.getNroElem(); i++){
            System.out.println(lista.getElementos()[i] + " ");
        }
        System.out.println();
    }
}