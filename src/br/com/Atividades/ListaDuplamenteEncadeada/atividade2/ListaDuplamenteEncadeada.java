package br.com.Atividades.ListaDuplamenteEncadeada.atividade2;

/**
 * Faça um programa que leia duas sequências de nomes de pessoas e armazene-os
 * em duas listas simplesmente encadeadas L1 e L2, respectivamente. Em seguida,
 * o programa deve criar uma terceira lista encadeada, contendo os nomes comuns
 * às duas listas e mostrar a lista resultante.
 *
 * @author Lucas Caminha;
 */
public class ListaDuplamenteEncadeada {

	private Celula inicio;
	private Celula fim;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		this.fim = null;
	}

	public void adiciona(String nome) {

		Celula celula = new Celula(nome);

		if (this.inicio == null && this.fim == null) {
			this.inicio = this.fim = celula;
		} else {
			this.fim.setProxima(celula);
			celula.setAnterior(this.fim);
			this.fim = celula;
		}

	}

	public void exibirLista() {

		if (this.inicio == null && this.fim == null) {
			System.out.println("Lista Vazia.");
		} else {
			Celula percorrer = this.inicio;

			while (percorrer != null) {
				System.out.println(percorrer.getNome());
				percorrer = percorrer.getProxima();
			}
		}

	}

	// Cria uma terceira lista com os itens em comum das duas listas passadas pelo
	// parametro.
	public static ListaDuplamenteEncadeada criaListaComNomesComuns(ListaDuplamenteEncadeada lista1,
			ListaDuplamenteEncadeada lista2) {

		ListaDuplamenteEncadeada terceiraLista = new ListaDuplamenteEncadeada();

		if (verificaListaVazia(lista1) || verificaListaVazia(lista2)) {
			System.out.println("Uma das listas está vazia.");
			return terceiraLista;
		} else {
			Celula percorrer1 = lista1.inicio;

			while (percorrer1 != null) {

				Celula percorrer2 = lista2.inicio;

				while (percorrer2 != null) {
					if (percorrer1.getNome().equals(percorrer2.getNome())) {
						terceiraLista.adiciona(percorrer1.getNome());

					}
					percorrer2 = percorrer2.getProxima();
				}

				percorrer1 = percorrer1.getProxima();
			}

			return terceiraLista;
		}

	}

	private static boolean verificaListaVazia(ListaDuplamenteEncadeada lista) {
		if (lista.inicio == null && lista.fim == null) {
			return true;
		} else {
			return false;
		}
	}

}
