package br.com.Atividades.prova.Questao01;

public class Professor {

    private String nome;
    private AreaAtuacao areaAtuacao;

    public Professor(String nome, AreaAtuacao areaAtuacao) {
        this.nome = nome;
        this.areaAtuacao = areaAtuacao;
    }

    public Professor(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AreaAtuacao getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", areaAtuacao=" + areaAtuacao +
                '}';
    }

    public enum AreaAtuacao {
        EXATAS, HUMANAS;
    }
}
