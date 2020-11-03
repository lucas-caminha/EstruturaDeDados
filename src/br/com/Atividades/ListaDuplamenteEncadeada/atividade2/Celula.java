package br.com.Atividades.ListaDuplamenteEncadeada.atividade2;

public class Celula {

    private Celula anterior;
    private String nome;
    private Celula proxima;

    public Celula(String nome) {
        this.nome = nome;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
