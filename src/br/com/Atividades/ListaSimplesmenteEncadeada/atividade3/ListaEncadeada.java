package br.com.Atividades.ListaSimplesmenteEncadeada.atividade3;

public class ListaEncadeada {

    private Celula primeiro;
    private Celula ultimo;

    // Adicionar.
    public void adicionar(int numero){

        Celula celula = new Celula(numero);

        if(primeiro == null && ultimo == null){
            this.primeiro = celula;
            this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
            this.ultimo = celula;
        }

    }

    public String buscaNumero(int numero){

        Celula percorrer = primeiro;
        int posicao = 0;

        while(percorrer != null){

            if(percorrer.getNumero() == numero){
                return numero+" na posição {"+posicao+"}.";
            } else {
                posicao++;
            }
            percorrer = percorrer.getProximo();
        }
        return "Não encontrado.";
    }





}
