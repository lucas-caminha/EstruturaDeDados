package br.com.Atividades.ListaDuplamenteEncadeada.atividade1;

public class Celula {

    private Celula anterior;
    private int numeroInteiro;
    private Celula proxima;

    public Celula(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    public void setNumeroInteiro(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
