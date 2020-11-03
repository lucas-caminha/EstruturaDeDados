package br.com.Atividades.ListaDuplamenteEncadeada.atividade2;

public class Run {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();
		ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();

		lista1.adiciona("Lucas");
		lista1.adiciona("Marcos");
		lista1.adiciona("Isadora");
		lista1.adiciona("Marcio");
		lista1.adiciona("Vanessa");

		lista2.adiciona("Carlos");
		lista2.adiciona("Vanessa");
		lista2.adiciona("Jaime");
		lista2.adiciona("Tereza");
		lista2.adiciona("Lucas");

		ListaDuplamenteEncadeada lista3 = ListaDuplamenteEncadeada.criaListaComNomesComuns(lista1, lista2);

		lista3.exibirLista();

	}
}
