package br.com.Atividades.ListaDuplamenteEncadeada.atividade4;

public class Celula {

	private Celula proximo;
	private int numeroImpar;
	private Celula anterior;

	public Celula(int numeroImpar) {
		this.numeroImpar = numeroImpar;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public int getNumeroImpar() {
		return numeroImpar;
	}

	public void setNumeroImpar(int numeroImpar) {
		this.numeroImpar = numeroImpar;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
}
