package br.com.Atividades.ListaSimplesmenteEncadeada.atividade2;

public class Aluno {

    private int numeroMatricula;
    private String nome;

    public Aluno(int numeroMatricula, String nome) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "numeroMatricula=" + numeroMatricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
