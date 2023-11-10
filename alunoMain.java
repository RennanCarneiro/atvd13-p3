package atvd13;

import java.util.Scanner;

public class alunoMain {
    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        // Digite os dados de 10 alunos e adicione-os à lista
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a matrícula do aluno " + i + ": ");
            String matricula = scanner.nextLine();
            System.out.println("Digite o nome do aluno " + i + ": ");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do aluno " + i + ": ");
            int idade = scanner.nextInt();
            System.out.println("Digite o curso do aluno " + i + ": ");
            String curso = scanner.nextLine();

            Aluno aluno = new Aluno(matricula, nome, idade, curso);
            cadastro.adicionarAluno(aluno);
        }

        System.out.println("\nLista de Alunos:");
        cadastro.imprimirAlunos();
        scanner.close();
    }
}
