package br.com.syonet;

public class App {
    public static void main(String[] args) {
        Gerenciamento gerenciamento = new Turma();
        gerenciamento.adicionarAluno(new Aluno("João", "123", 10));
        gerenciamento.adicionarAluno(new Aluno("Maria", "456", 9));
        gerenciamento.adicionarAluno(new Aluno("Pedro", "789", 8));
        gerenciamento.adicionarAluno(new Aluno("Ana", "321", 7));

        System.out.println("Alunos: " + gerenciamento.listarAlunos());
        System.out.println(String.format("Média das notas: %.2f", gerenciamento.calcularMedia()));

       
    }
}

