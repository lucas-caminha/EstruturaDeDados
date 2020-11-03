package br.com.Atividades.ListaSimplesmenteEncadeada.atividade2;

public class ListaEncadeada {

    private Celula primeiro;
    private Celula posicaoAtual;
    private Celula ultimo;

    // Adiciona o aluno na lista.
    public void adiciona(Aluno aluno){

        Celula celula = new Celula(aluno);

        if(isVazia()){
            this.primeiro = this.ultimo = celula;
        } else {
            this.ultimo.setProximo(celula);
            this.ultimo = celula;
        }

    }

    // Remove o aluno da lista passado pelo parametro
    public String remove(Aluno aluno){

        Celula celula = new Celula(aluno);
        Celula percorrer = this.primeiro;

        if (this.isVazia()){
            return "Lista Vazia.";
        } else {
            while(percorrer != null){
                if(celula.getAluno().getNome().equals(percorrer.getAluno().getNome())){

                    String msg = "Encontrado e Removido: " + percorrer.getAluno().toString();

                    if (percorrer == this.primeiro && percorrer == this.ultimo){
                        this.primeiro = this.ultimo = null;

                    } else if (percorrer == this.primeiro){
                        this.primeiro = percorrer.getProximo();

                    } else if (percorrer == this.ultimo){
                        percorrer = buscaPenultimoElemento(this.primeiro);
                        percorrer.setProximo(null);
                        this.ultimo = percorrer;
                    }
                    else {
                        this.posicaoAtual = buscaElementoAnterior(aluno);
                        this.posicaoAtual.setProximo(this.posicaoAtual.getProximo().getProximo());
                    }

                    return msg;
                }
                percorrer = percorrer.getProximo();
            }
        }
        return "Não encontrado.";
    }


    // Verifica se a lista está vazia.
    public boolean isVazia(){
        if(this.primeiro == null && this.ultimo == null){
            return true;
        } else {
            return false;
        }
    }




    // Busca elemento
    public Celula buscaElemento(Aluno aluno){

        Celula celula = new Celula(aluno);
        Celula percorrer = this.primeiro;

        if(isVazia()){
            return null;
        } else {

            while(percorrer != null){

                if(celula.getAluno().getNome().equals(percorrer.getAluno().getNome())){
                    return percorrer;
                }

                percorrer = percorrer.getProximo();
            }

            return null;
        }


    }

    // Lista todos os elementos.
    public void listaElementos(){

        Celula celula = primeiro;

        if(isVazia()){
            System.out.println("Lista Vazia.");
        } else {
            while(celula != null){
                System.out.println(celula.getAluno().toString());
                celula = celula.getProximo();
            }
        }
    }

    // Colocar a lista em ordem alfabética
    public ListaEncadeada listaEmOrdemAlfabetica(){

        return new ListaEncadeada();

    }


    private Celula buscaPenultimoElemento(Celula celula){
        if(celula.getProximo().equals(this.ultimo)){
            return celula;
        }
        return this.buscaPenultimoElemento(celula.getProximo());
    }

    public Celula buscaElementoAnterior(Aluno aluno){

        Celula celula = new Celula(aluno);
        Celula percorrer = this.primeiro;

        if(isVazia()){
            return null;
        } else {

            while(percorrer != null){

                if(celula.getAluno().getNome().equals(percorrer.getProximo().getAluno().getNome())){
                    return percorrer;
                }

                percorrer = percorrer.getProximo();
            }

            return null;
        }


    }

}
