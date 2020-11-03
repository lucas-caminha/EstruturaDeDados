package br.com.Atividades.ListaDuplamenteEncadeada.atividade4;

public class Run {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

		int loop = 1;
		int impar = 1;

		while (loop <= 15) {
			lista.adicionaNoFim(impar += 2);
			loop++;
		}

		lista.adicionaNoInicio(1);
		lista.adicionaNoFim(51);
		lista.exibeLista();
		lista.removeNoInicio();
		lista.removeNoFim();
		lista.exibeLista();

	}
}
