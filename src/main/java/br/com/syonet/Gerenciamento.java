package br.com.syonet;

import java.util.List;

public interface Gerenciamento {
    void adicionarAluno(Aluno a);
    void removerAluno(String matricula);
    List<Aluno> listarAlunos();
    double calcularMedia();
}

