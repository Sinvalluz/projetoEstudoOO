package roteiro4.parte2;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123456, "Sinval Luz", "Engenharia da computação", 2022);

        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Curso: " + aluno.curso);
        System.out.println("Ano de Ingresso: " + aluno.anoIngresso);
    }
}
