package roteiro4.parte3;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123456, "Sinval Luz", "Engenharia da computação", 2022);

        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());

        aluno.setMatricula(857456);

        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
    }
}
