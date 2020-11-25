package br.com.Atividades.prova.Questao02;

public class Entrevista {

    private Contato[] contatos;
    private int posicaoFila;
    private int inicio;
    private int fim;

    public Entrevista(){
        this.inicio = this.fim = -1;
        this.contatos = new Contato[50];
        this.posicaoFila = 0;
    }

    public void inserirEntrevistado(Contato contato){
        if (estaCheia()){
            System.out.println("A Fila de entrevistados está cheia.");
        } else {
            if (this.inicio == -1){
                this.inicio = 0;
            }
            this.contatos[++this.fim] = contato;
            ++this.posicaoFila;
        }
    }

    public String proximoEntrevistado(){
        if (estaVazia()){
            return "Fila de entrevistados vazia.";
        } else {
            this.inicio++;
            this.posicaoFila--;
            return this.contatos[this.inicio].toString();
        }
    }


    public boolean estaVazia(){
        return this.posicaoFila <= 0;
    }

    public boolean estaCheia(){
        return this.posicaoFila == this.contatos.length-1;
    }


}
