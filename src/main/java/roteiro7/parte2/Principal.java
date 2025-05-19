package roteiro7.parte2;

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

        System.out.println("\nListando os Alunos: ");
        System.out.println("******************************************");
        for (Aluno listaAluno : listaAlunos) {
            System.out.println("Matricula: " + listaAluno.getMatricula());
            System.out.println("Nome: " + listaAluno.getNome());
            System.out.println("Curso: " + listaAluno.getCurso());
            System.out.println("Ano Ingresso: " + listaAluno.getAnoIngresso());
            System.out.println("******************************************");
        }
    }
}
