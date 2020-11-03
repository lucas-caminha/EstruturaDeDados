package br.com.Atividades.ListaSimplesmenteEncadeada.atividade5;

public class Celula {

	private int numero;
	private Celula proximo;

	public Celula(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
