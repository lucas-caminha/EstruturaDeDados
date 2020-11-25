package br.com.Atividades.prova.Questao01;

public class Celula {

    private Celula proximo;
    private Professor professor;

    public Celula(Professor professor) {
        this.professor = professor;
    }

    public Celula(){
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
