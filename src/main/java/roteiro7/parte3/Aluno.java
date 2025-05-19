package roteiro7.parte3;

import java.util.ArrayList;

public class Aluno {
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplina;
    private String situacao;
    private ArrayList<String> listaDisciplinas;

    public Aluno (int matricula, String nome, String curso, int anoIngresso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.listaDisciplinas = new ArrayList<>();
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
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

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeDisciplina() {
        return listaDisciplinas.size();
    }

    public void setQtdeDisciplina(int qtdeDisciplina) {
        this.qtdeDisciplina = qtdeDisciplina;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void adicionarDisciplina (String disciplina) {
        this.listaDisciplinas.add(disciplina);
    }

    public ArrayList<String> mostrasDisciplinas() {
        return this.listaDisciplinas;
    }
}