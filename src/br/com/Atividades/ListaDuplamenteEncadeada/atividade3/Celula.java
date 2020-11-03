package br.com.Atividades.ListaDuplamenteEncadeada.atividade3;

public class Celula {

	private Celula anterior;
	private Aluno aluno;
	private Celula proxima;

	public Celula(Aluno aluno) {
		this.aluno = aluno;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
}
