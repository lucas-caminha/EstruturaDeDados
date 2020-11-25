package br.com.Atividades.prova.Questao01;

public class FilaSimplesmenteEncadeada {

    private Celula inicio;
    private Celula fim;

    public FilaSimplesmenteEncadeada() {
        this.inicio = this.fim = null;
    }

    public void enfileira(String nomeProfessor, Professor.AreaAtuacao areaAtuacao){
        Professor professor = new Professor(nomeProfessor, areaAtuacao);
        Celula celula = new Celula(professor);

        if (estaVazia()){
            this.inicio = this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }

    }

    public void desenfileira(){
        if (!estaVazia()){
            this.inicio = this.inicio.getProximo();;
        }
    }

    public void exibeFila(){
        Celula percorrer = this.inicio;
        while(percorrer != null){
            System.out.println(percorrer.getProfessor().toString());
            percorrer = percorrer.getProximo();
        }
    }

    private boolean estaVazia(){
        if(this.inicio == null && this.fim == null){
            return true;
        }
        return false;
    }

}
