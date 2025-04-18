package roteiro4.parte4;

import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplina;
    private String situacao;

    public Aluno(int matricula, String nome, String curso, int anoIngresso, int qtdeDisciplina){
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.qtdeDisciplina = qtdeDisciplina;
    }

    public int getMatricula () {
        return matricula;
    }

    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso (String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeDisciplina() {
        return qtdeDisciplina;
    }

    public void setQtdeDisciplina(int qtdeDisciplina) {
        this.qtdeDisciplina = qtdeDisciplina;
    }

    public String getSituacao() {
        if (qtdeDisciplina > 0) {
            situacao = "Matriculado";
        } else {
            situacao = "Não matriculado";
        }
        return situacao;
    }
}
