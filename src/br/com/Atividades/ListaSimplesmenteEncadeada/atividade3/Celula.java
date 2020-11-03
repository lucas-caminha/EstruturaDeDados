package br.com.Atividades.ListaSimplesmenteEncadeada.atividade3;

public class Celula {

	private Celula proximo;
	private int numero;

	public Celula(int numero) {
		this.numero = numero;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
