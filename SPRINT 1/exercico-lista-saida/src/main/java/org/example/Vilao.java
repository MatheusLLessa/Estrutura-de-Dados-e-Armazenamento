package org.example;

public class Vilao {
    private int[] elementos;
    private int id;
    private String nome;
    private int idade;
    private double poder;
    private String objetivo;
    private boolean capturado;
    private String arquiInimigo;


    public Vilao(int capacidade, int id, String nome, int idade, double poder, String objetivo, boolean capturado, String arquiInimigo) {
        this.elementos = new int[capacidade];
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.poder = poder;
        this.objetivo = objetivo;
        this.capturado = capturado;
        this.arquiInimigo = arquiInimigo;
    }

    public int[] getElementos() {
        return elementos;
    }

    public void setElementos(int[] elementos) {
        this.elementos = elementos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public String getArquiInimigo() {
        return arquiInimigo;
    }

    public void setArquiInimigo(String arquiInimigo) {
        this.arquiInimigo = arquiInimigo;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", poder=" + poder +
                ", objetivo='" + objetivo + '\'' +
                ", capturado=" + capturado +
                ", arquiInimigo='" + arquiInimigo + '\'' +
                '}';
    }
}
