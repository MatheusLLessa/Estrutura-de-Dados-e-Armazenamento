package org.example;

public class listaEstatica {
    private int[] elementos;
    private int nroElem;
    private int capacidade;

    public listaEstatica(int capacidade) {
        this.elementos = new int[capacidade];
        this.nroElem = 0;
        this.capacidade = capacidade;
    }


    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getNroElem() {
        return nroElem;
    }

    public void setNroElem(int nroElem) {
        this.nroElem = nroElem;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean substitui(int valorAntigo, int valorNovo){
        for (int i = 0; i < nroElem; i++){
            if (elementos[i] == valorAntigo){
                elementos[i] = valorNovo;
                return true;
            }
        }
        System.out.println("Valor não encontrador");
        return false;
    }

    public int contaOcorrencia(int valor){
        int contador = 0;
        for (int i = 0; i < nroElem; i++){
            if(elementos[i] == valor){
                contador++;
            }
        }
        return contador;
    }

    public boolean adicionaNoInico(int valor){
        if(nroElem >= capacidade){
            System.out.println("Lista cheia");
            return false;
        }
        for (int i = nroElem - 1; i >= 0; i--){
            elementos[i + 1] = elementos[i];
        }
        elementos[0] = valor;
        nroElem++;
        return true;
    }
}
