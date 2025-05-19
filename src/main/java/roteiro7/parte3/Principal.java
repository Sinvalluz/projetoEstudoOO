package roteiro7.parte3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos você quer cadastrar: ");
        int tamanhoArray = input.nextInt();
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        int aluno = 1;

        System.out.println("Digite as informações de " + tamanhoArray + (tamanhoArray == 1? " aluno.": " alunos."));

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("\nAluno0" + aluno);
            System.out.print("Matricula: ");
            int matricula = input.nextInt();

            input.nextLine();

            System.out.print("Nome: ");
            String nome = input.nextLine();

            System.out.print("Curso: ");
            String curso = input.nextLine();

            System.out.print("Ano de ingresso: ");
            int anoIngresso = input.nextInt();

            listaAlunos.add(new Aluno(matricula, nome, curso, anoIngresso));


            aluno++;
        }

        System.out.println("Quantas disciplinas você quer adicionar? ");
        int qtdDeDisciplinas = input.nextInt();

        input.nextLine();

        for (Aluno listaAluno : listaAlunos) {
            System.out.println("Adicione as disciplinas para " + listaAluno.getNome() + ".\n");
            for (int i = 0; i < qtdDeDisciplinas; i++) {
                System.out.print("Digite o nome de uma disciplina: ");
                String disciplina = input.nextLine();
                listaAluno.adicionarDisciplina(disciplina);
            }
        }




        input.close();
        System.out.println("\nListando os Alunos: ");
        System.out.println("******************************************");
        for (Aluno listaAluno : listaAlunos) {
            System.out.println("Matricula: " + listaAluno.getMatricula());
            System.out.println("Nome: " + listaAluno.getNome());
            System.out.println("Curso: " + listaAluno.getCurso());
            System.out.println("Ano Ingresso: " + listaAluno.getAnoIngresso());
            System.out.println("Quantidade de disciplinas: " + listaAluno.getQtdeDisciplina());
            System.out.println("Disciplinas: " + listaAluno.mostrasDisciplinas());
            System.out.println("******************************************");
        }
    }
}
