package org.example;

public class TesteAluno {
    public static void main(String[] args) {

        AlunoGraduacao aluno1 = new AlunoGraduacao(01222154,"Matheus",8.0,6.0);
        AlunoFundamental aluno2 = new AlunoFundamental(01222564,"Lessa",6.0,7.5,5.5,5.0);
        AlunoPos aluno3 = new AlunoPos(012224,"Lima",8.0,6.0,9.0);

        Escola sptech = new Escola();

        // Adicionando os Alunos
        sptech.adicionaAluno(aluno2);
        sptech.adicionaAluno(aluno1);
        sptech.adicionaAluno(aluno3);

        // Lista de todos os Aluno
        sptech.exibeTodos();

        // Lista de todos os Aluno Graduação
        sptech.exibeAlunosGraduacao();

        // Lista de todos os Aluno Aprovados
        sptech.exibeAprovados();

        System.out.println("\nRA dos alunos cadastro na escola");
        sptech.buscaAluno(01222154);
        sptech.buscaAluno(01222564);
        sptech.buscaAluno(012224);
    }
}
