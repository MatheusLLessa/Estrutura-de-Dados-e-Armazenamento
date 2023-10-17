package org.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List <Aluno> listaAluno;


    public Escola(){
        listaAluno = new ArrayList<>();
    }

    public void adicionaAluno(Aluno a){
        listaAluno.add(a);
    }

    public void exibeTodos(){
        System.out.println("\nLista dos Alunos");
        for (Aluno a : listaAluno){
            System.out.println(a);
        }
    }

    public void exibeAlunosGraduacao(){
        System.out.println("\nLista dos Alunos Graduação");
        for (Aluno a : listaAluno){
            if (a instanceof AlunoGraduacao){
                System.out.println(a);
            }
        }
    }

    public void exibeAprovados(){
        System.out.println("\nLista dos Alunos Aprovados");
        for (Aluno a : listaAluno){
            if (a.calculaMedia() >= 6.0){
                System.out.println(a.calculaMedia());
            }
        }
    }

    public void buscaAluno(Integer ra){
        boolean alunoEncontrado = false;
        for (Aluno a : listaAluno) {
            if (a.getRa().equals(ra)) {
                System.out.println(ra);
                alunoEncontrado = true;
                break;
            }
        }
        if (!alunoEncontrado) {
            System.out.println("\nAluno não encontrado");
        }
    }
}
