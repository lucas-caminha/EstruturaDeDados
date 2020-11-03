package br.com.Atividades.ListaDuplamenteEncadeada.atividade1;

public class Run {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		for (int i = 1; i <= 5; i++) {
			lista.adiciona(i * 10);
		}

		lista.exibeLista();

	}

}
