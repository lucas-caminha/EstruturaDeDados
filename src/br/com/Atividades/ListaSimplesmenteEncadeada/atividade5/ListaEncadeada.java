package br.com.Atividades.ListaSimplesmenteEncadeada.atividade5;

public class ListaEncadeada {

    private Celula primeiro;
    private Celula ultimo;
    private static int tamanho;

    public void adicionaInicio(int numero){

        if(listaCheia()){
            System.out.println("Não foi possivel adicionar.");
        } else {

            Celula celula = new Celula(numero);
            if (isVazia()) {
                this.primeiro = this.ultimo = celula;
            } else {
                celula.setProximo(this.primeiro);
                this.primeiro = celula;
            }
            tamanho++;
        }
    }

    public void adicionaFim(int numero){

        if(listaCheia()){
            System.out.println("Não foi possivel adicionar.");
        } else {
            Celula celula = new Celula(numero);
            if (isVazia()) {
                this.primeiro = this.ultimo = celula;
            } else {
                ultimo.setProximo(celula);
                ultimo = celula;
            }
            tamanho++;
        }
    }

    public boolean isVazia(){
        if(primeiro == null && ultimo == null){
            return true;
        } else{
            return false;
        }
    }

    public boolean listaCheia(){
        if(tamanho >= 7){
            System.out.println("A lista está cheia.");
            return true;
        } else{
            return false;
        }
    }


}
