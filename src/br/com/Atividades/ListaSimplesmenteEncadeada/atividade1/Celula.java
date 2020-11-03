package br.com.Atividades.ListaSimplesmenteEncadeada.atividade1;

public class Celula {

    private Celula proximo;
    private Professor valor;

    public Celula(Professor valor) {
        this.valor = valor;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Professor getValor() {
        return valor;
    }

    public void setValor(Professor valor) {
        this.valor = valor;
    }
}
