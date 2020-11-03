package br.com.Atividades.ListaDuplamenteEncadeada.atividade3;


/**
 * Utilizando listas duplamente encadeadas, faça um programa que cadastre
 * 5 alunos, com o seu nome e idade. Após cadastrar os 5 alunos, deverá ter um
 * método para incluir no início da lista um aluno e no final da lista mais um aluno,
 * totalizando assim uma lista com 7 alunos. Liste os 7 alunos da lista.
 *
 * @author Lucas Caminha
 */
public class ListaDuplamenteEncadeada {

    private Celula inicio;
    private Celula fim;

    public ListaDuplamenteEncadeada(){
        this.inicio = null;
        this.fim = null;
    }


    public void adiciona(String nome, int idade){

        Aluno aluno = new Aluno(nome, idade);
        Celula celula = new Celula(aluno);

        if (isVazia()){
            this.inicio = this.fim = celula;
        } else {
            this.fim.setProxima(celula);
            celula.setAnterior(this.fim);
            this.fim = celula;
        }

    }

    // Adiciona no inicio da lista.
    public void adicionaNoInicio(String nome, int idade){

        Aluno aluno = new Aluno(nome,idade);
        Celula celula = new Celula(aluno);

        if(isVazia()){
            this.inicio = this.fim = celula;
        } else {
            this.inicio.setAnterior(celula);
            celula.setProxima(this.inicio);
            this.inicio = celula;
        }

    }

    // Adiciona no fim da lista.
    public void adicionaNoFim(String nome, int idade){
        Aluno aluno = new Aluno(nome, idade);
        Celula celula = new Celula(aluno);

        if (isVazia()){
            this.inicio = this.fim = celula;
        } else {
            this.fim.setProxima(celula);
            celula.setAnterior(this.fim);
            this.fim = celula;
        }

    }

    // Exibe a lista.
    public void exibeLista(){

        Celula percorrer = this.inicio;

        while (percorrer != null){
            System.out.println(percorrer.getAluno().toString());
            percorrer = percorrer.getProxima();
        }


    }

    public boolean isVazia(){
        if (this.inicio == null && this.fim == null){
            return true;
        } else {
            return false;
        }
    }


}
