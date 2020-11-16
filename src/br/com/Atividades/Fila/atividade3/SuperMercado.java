package br.com.Atividades.Fila.atividade3;

/*
 	3- Crie um programa em java para gerenciar a fila de supermercado:
	a) Inserir cliente
	b) Remover cliente
	c) Consultar quantos clientes tem na fila
	d) Sair.
*/


public class SuperMercado {
	
	public static void main(String[] args) {
		
		SuperMercado sm = new SuperMercado();
		sm.insereCliente("Luc");
		sm.insereCliente("Mat");
		sm.insereCliente("Tes");
		sm.insereCliente("Cas");
		
		sm.removeCliente();

		System.out.println(sm.clientesNaFila());
	}
	
	private String[] fila;
	private int inicio, fim, posicaoFila;
	
	public SuperMercado() {
		this.fila = new String[10];
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
	}
	
	// Insere cliente na fila.
	public void insereCliente(String cliente) {
		if (!(this.posicaoFila == this.fila.length -1)) {
			if (this.inicio == -1) {
				this.inicio = 0;
			}
			this.fila[++this.fim] = cliente;
			this.posicaoFila++;
		} else {
			System.out.println("Lista vazia.");
		}
	}
	
	// Remove cliente da fila.
	public void removeCliente() {
		
		if (this.posicaoFila == 0) {
			System.out.println("Fila vazia.");
		} else {
			this.inicio++;
			this.posicaoFila--;
		}
		
	}
	
	public int clientesNaFila() {
		return this.posicaoFila;
	}
}
