package br.com.Atividades.Fila.atividade1;

import java.util.Iterator;

/**
 * 
 * @author lucas.caminha
 * Criação de uma Fila genérica com Vetor.
 */
public class Fila {
	
	private Object[] fila;
	private int inicio;
	private int fim;
	private int quantidadeElementos;
	private int tamanhoFila = 10;
	
	// Criação da Fila.
	public Fila() {
		this.quantidadeElementos = 0;
		this.inicio = this.fim = -1;
		this.fila = new Object[tamanhoFila];
	}
	
	// Exibe a fila
	public void show() {
		String elementos = "";
		for(int i = inicio; i < fila.length; i++) {
			if(fila[i] != null) {
				elementos += fila[i] + " - ";
			}
		}
		System.out.println(elementos);
	}
	
	// Adiciona na fila.
	public void enqueue(Object valor) {
		if (!isFull()) {
			if(inicio == -1) {
				inicio = 0;
			}
			fim++;
			fila[fim] = valor;
			quantidadeElementos++;
		}

	}
	
	// Remove da fila.
	public void dequeue() {
		if (!isEmpty()) {
			inicio++;
			quantidadeElementos--;
		}
	}
	
	// Verifica se Fila está vazia.
	public boolean isEmpty() {
		return quantidadeElementos == 0;
	}
	
	public boolean isFull() {
		return this.quantidadeElementos == this.tamanhoFila-1;
	}
	
	public int size() {
		return this.quantidadeElementos;
	}
	
	
	
	
	

}
