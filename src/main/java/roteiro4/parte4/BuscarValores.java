package roteiro4.parte4;

import java.util.Scanner;

public class BuscarValores {
    public static void lerValores () {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da sua matrícula: ");
        int matricula = input.nextInt();
        input.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o nome do seu curso: ");
        String curso = input.nextLine();

        System.out.print("Digite o ano que você ingressou: ");
        int anoIngresso = input.nextInt();

        System.out.print("Digite quantas disciplinas você cursa: ");
        int qtdeDisciplina = input.nextInt();
        input.close();

        Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso, qtdeDisciplina);

        System.out.println("matrícula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano Ingresso: " + aluno01.getAnoIngresso());
        System.out.println("Quantidade de disciplinas: " + aluno01.getQtdeDisciplina());
        System.out.println("Situação: " + aluno01.getSituacao());

    }


}
