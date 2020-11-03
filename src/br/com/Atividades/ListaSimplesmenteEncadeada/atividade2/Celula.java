package br.com.Atividades.ListaSimplesmenteEncadeada.atividade2;

public class Celula {

    private Celula proximo;
    private Aluno aluno;

    public Celula(Aluno aluno) {
        this.aluno = aluno;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
