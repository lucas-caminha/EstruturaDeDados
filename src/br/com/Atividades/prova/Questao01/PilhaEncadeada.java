package br.com.Atividades.prova.Questao01;

public class PilhaEncadeada {

    private Celula inicio;
    private Celula fim;

    public PilhaEncadeada() {
        this.inicio = this.fim = null;
    }

    public void empilha(String nomeProfessor, Professor.AreaAtuacao areaAtuacao){
        Professor professor = new Professor(nomeProfessor, areaAtuacao);
        Celula celula = new Celula(professor);
        if (estaVazia()){
            this.inicio = this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
    }

    public void desempilha(){
        if (!estaVazia()){
            this.fim = buscaPenultimo();
            this.fim.setProximo(null);
        }
    }

    public void exibe(){
        Celula percorrer = this.inicio;
        if (!estaVazia()){
            while (percorrer != null){
                System.out.println(percorrer.getProfessor().toString());
                percorrer = percorrer.getProximo();
            }
        }
    }

    private Celula buscaPenultimo(){
        Celula percorrer = this.inicio;
        if (!estaVazia()){
            while (percorrer != null){
                if (percorrer.getProximo() == this.fim) {
                    return percorrer;
                }
                percorrer = percorrer.getProximo();
            }

        }
        return null;
    }

    public boolean estaVazia(){
        if (this.inicio == null && this.fim == null){
            return true;
        }
        return false;
    }

}
