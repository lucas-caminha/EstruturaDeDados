package br.com.Atividades.ListaCircular.atividade1;

public class Celula {
	
	private Celula anterior;
	private Pessoa pessoa;
	private Celula proximo;
		
	public Celula(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
	
	

}
