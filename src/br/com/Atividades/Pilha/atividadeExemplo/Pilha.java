package br.com.Atividades.Pilha.atividadeExemplo;

/**
 * 
 * @author lucas.caminha
 * Cria��o de uma pilha gen�rica.
 */

public class Pilha {
	
	private Object[] pilha;
	private int posicaoPilha;
	
	// Cria��o da pilha.
	public Pilha() {
		this.posicaoPilha = -1;
		this.pilha = new Object[10];
	}
	
	// Empilhamento
	public void push(Object valor) {
		if (this.posicaoPilha < this.pilha.length - 1 ) {
			this.pilha[++posicaoPilha] = valor;
		}
	}
	
	// Desempilhamento
	public Object pop() {
		if (isEmpty()) {
			return null;
		}
		return this.pilha[this.posicaoPilha--];
	}
	
	// Verifica o tamanho da pilha.
	public int size() {
		if(isEmpty()) {
			return 0;
		} else {
			return this.posicaoPilha + 1;
		}
	}
	
	// Exibe ultimo valor
	public Object stacktop() {
		if (this.isEmpty()) {
			return null;
		}
		return this.pilha[this.posicaoPilha];
	}
	
	// Verifica se a pilha est� vazia.
	public boolean isEmpty() {
		if(this.posicaoPilha == -1) {
			return true;
		} else {
			return false;
		}
	}

}
