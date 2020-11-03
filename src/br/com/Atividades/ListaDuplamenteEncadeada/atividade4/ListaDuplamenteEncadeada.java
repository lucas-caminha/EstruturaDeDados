package br.com.Atividades.ListaDuplamenteEncadeada.atividade4;

/**
 * 04 – Faça um programa utilizando listas duplamente encadeadas que armazene
 * os 15 números impares. O programa deverá ter as seguintes funcionalidades:
 * a) Inserir no inicio b) Inserir no fim c) Remover no inicio d) Remover no fim
 * e) Listar todos da lista.
 *
 * @author Lucas Caminha
 */

public class ListaDuplamenteEncadeada {

	private Celula inicio;
	private Celula fim;

	public ListaDuplamenteEncadeada() {
		this.inicio = null;
		this.fim = null;
	}

	// Método adiciona no inicio da lista.
	public void adicionaNoInicio(int numeroImpar) {

		if (verificaImpar(numeroImpar)) {

			Celula celula = new Celula(numeroImpar);

			if (isVazia()) {
				this.inicio = this.fim = celula;
			} else {
				this.inicio.setAnterior(celula);
				celula.setProximo(this.inicio);
				this.inicio = celula;
			}

		} else {
			numeroNaoImpar();
		}
	}

	// Método adiciona no fim da lista.
	public void adicionaNoFim(int numeroImpar) {

		if (verificaImpar(numeroImpar)) {

			Celula celula = new Celula(numeroImpar);

			if (isVazia()) {
				this.inicio = this.fim = celula;
			} else {
				this.fim.setProximo(celula);
				celula.setAnterior(this.fim);
				this.fim = celula;
			}

		} else {
			numeroNaoImpar();
		}

	}

	// Remove o primeiro da lista.
	public void removeNoInicio() {

		if (isVazia()) {
			System.out.println("Lista Vazia.");
		} else {
			this.inicio = this.inicio.getProximo();
			this.inicio.setAnterior(null);
		}

	}

	// Remove o ultimo da lista.
	public void removeNoFim() {

		if (isVazia()) {
			System.out.println("Lista Vazia.");
		} else {
			this.fim = this.fim.getAnterior();
			this.fim.setProximo(null);
		}

	}

	public void exibeLista() {
		if (isVazia()) {
			System.out.println("A lsita está vazia.");
		} else {
			Celula percorrer = this.inicio;

			while (percorrer != null) {
				System.out.println(percorrer.getNumeroImpar());
				percorrer = percorrer.getProximo();
			}
		}
	}

	public void numeroNaoImpar() {
		System.out.println("O Número não é Impar, portanto não foi adicionado.");
	}

	public boolean verificaImpar(int numero) {
		if (numero % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isVazia() {
		if (this.inicio == null && this.fim == null) {
			return true;
		} else {
			return false;
		}
	}

}
