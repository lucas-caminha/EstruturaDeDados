package br.com.Atividades.ListaSimplesmenteEncadeada.atividade1;

public class Teste {

	public static void main(String[] args) {
		/**
		 * Atividade 1.
		 */
		ListaEncadeada lista = new ListaEncadeada();

		lista.adicionar(new Professor("Raimundo"));
		lista.adicionar(new Professor("Tereza"));
		lista.adicionar(new Professor("Armandinho"));
		lista.adicionar(new Professor("Clebinho"));
		lista.adicionar(new Professor("Jaime"));
		lista.adicionar(new Professor("Kaka"));
		lista.adicionar(new Professor("Pato"));
		lista.adicionar(new Professor("Dede"));

		System.out.println(lista.tamanhoDaLista());
		lista.listar();

		lista.remover(new Professor("Raimundo"));
		// lista.removerUltimo();

		System.out.println(lista.tamanhoDaLista());
		lista.listar();
	}
}
