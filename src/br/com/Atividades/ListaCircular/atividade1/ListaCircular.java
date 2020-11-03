package br.com.Atividades.ListaCircular.atividade1;

public class ListaCircular {
	
	private Celula primeiro;
	private Celula ultimo;
	
	public ListaCircular() {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public Celula getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Celula primeiro) {
		this.primeiro = primeiro;
	}
	public Celula getUltimo() {
		return ultimo;
	}
	public void setUltimo(Celula ultimo) {
		this.ultimo = ultimo;
	}
	
	
	public void adiciona(Pessoa pessoa) {
		Celula celula = new Celula(pessoa);
		
		if(estaVazia()) {
			this.primeiro = this.ultimo = celula;
		} else {
			this.ultimo.setProximo(celula);
			celula.setAnterior(this.ultimo);
			this.ultimo = celula;
			this.ultimo.setProximo(this.primeiro);
			this.primeiro.setAnterior(this.ultimo);
		}
	}
	
	public void removeNoFim() {
		if(estaVazia()) {
			System.out.println("Lista Vazia.");
		} else {
			this.ultimo = this.ultimo.getAnterior();
			this.ultimo.setProximo(this.primeiro);
		}
	}
	
	public void exibeLista() {
		
		Celula percorrer = this.primeiro;
		
		if (estaVazia()) {
			System.out.println("Lista Vazia.");
		} else {
			do {
				System.out.println(percorrer.getPessoa().toString());
				percorrer = percorrer.getProximo();
			} while(percorrer != this.primeiro);
		}

	}

	private boolean estaVazia() {
		if(this.primeiro == null && this.ultimo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	
	

}
