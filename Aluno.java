package atvd13;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
     private String matricula;
    private String nome;
    private int idade;
    private String curso;

    public Aluno(String matricula, String nome, int idade, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }
}

class CadastroAluno {
    private List<Aluno> listaAlunos;

    public CadastroAluno() {
        listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println();
        }
    }
}
