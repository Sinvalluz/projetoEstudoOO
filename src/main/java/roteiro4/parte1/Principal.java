package roteiro4.parte1;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.matricula = 123456;
        aluno.nome = "Sinval Luz";
        aluno.curso = "Engenharia da computação";
        aluno.anoIngresso = 2022;

        // Exibindo os dados do aluno
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Ano de Ingresso: " + aluno.anoIngresso);
    }
}
