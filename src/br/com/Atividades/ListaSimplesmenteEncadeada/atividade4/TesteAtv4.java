package br.com.Atividades.ListaSimplesmenteEncadeada.atividade4;

import br.com.Atividades.ListaSimplesmenteEncadeada.atividade1.Celula;
import br.com.Atividades.ListaSimplesmenteEncadeada.atividade1.ListaEncadeada;
import br.com.Atividades.ListaSimplesmenteEncadeada.atividade1.Professor;

public class TesteAtv4 {

	public static void main(String[] args) {

		/**
		 * Utilizando uma das listas criadas nos exercícios 1, 2 ou 3, implemente uma
		 * busca e faça o uso da recursividade.
		 */

		ListaEncadeada lista = new ListaEncadeada();

		lista.adicionar(new Professor("Lucas"));
		lista.adicionar(new Professor("Marco"));
		lista.adicionar(new Professor("Pedro"));
		lista.adicionar(new Professor("Elizabet"));

		Celula celula = lista.buscaRecursiva(lista.getPrimeiro(), "Pedro");

		System.out.println(celula.getValor().toString());

	}

}
