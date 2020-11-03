package br.com.Atividades.ListaDuplamenteEncadeada.atividade1;

/**
 * 1. O programa abaixo demonstra a inclusão e exibição de números inteiros (à
 *    esquerda e à direita) em uma lista duplamente encadeada.
 *
 * @author Lucas Caminha
 */

public class ListaDuplamenteEncadeada {

    private Celula primeiro;
    private Celula ultimo;

    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adiciona(int numeroInteiro){
        Celula celula = new Celula(numeroInteiro);

        if (isVazia()){
            this.primeiro = this.ultimo = celula;
        } else {
            this.ultimo.setProxima(celula);
            celula.setAnterior(this.ultimo);
            this.ultimo = celula;
        }

    }

    public void exibeLista(){

        Celula percorrer = this.primeiro;

        while (percorrer != null){

            if (percorrer == this.primeiro){
                System.out.print("| Anterior: Null ");
            } else {
                System.out.print("| Anterior: " + percorrer.getAnterior().getNumeroInteiro() + " ");
            }

            System.out.print("| Atual = " + percorrer.getNumeroInteiro());

            if (percorrer == this.ultimo){
                System.out.print("| Próximo: Null ");
            } else {
                System.out.print("| Próximo: " + percorrer.getProxima().getNumeroInteiro() + " \n");
            }

            percorrer = percorrer.getProxima();
        }

    }


    public boolean isVazia(){
        if(this.primeiro == null && this.ultimo == null){
            return true;
        } else {
            return false;
        }
    }




}
