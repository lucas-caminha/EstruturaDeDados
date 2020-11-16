package br.com.Atividades.Fila.atividade1;

/*
 * 
    1- Crie um programa em java para gerenciar uma playlist da sua festa em
	casa de final de ano. Organize as músicas que deverão ser todas na ordem e
	insiram em uma fila.
	a) Inserir musica
	b) Consultar música
	c) Remover música
	d) Sair.
 */

public class PlayList {
	
	public static void main(String[] args) {
		
		PlayList pl =  new PlayList();
		
		pl.enqueue("Cowboy fora da lei");
		pl.enqueue("Gita");
		pl.enqueue("Maluco beleza");
		
		System.out.println(pl.size());
		
		System.out.println(pl.search("Gita"));
		
		
		pl.dequeue();
		System.out.println(pl.size());
		pl.dequeue();
		System.out.println(pl.search("Maluco beleza"));
		System.out.println(pl.size());
		
	}
	
	private String[] musicas;
	private int posicaoFila;
	private int inicio;
	private int fim;
	
	public PlayList() {
		this.inicio = this.fim = -1;
		this.musicas = new String[10];
		this.posicaoFila = 0;
	}
	
	// Insere música.
	public void enqueue(String musica) {
		if (isFull()) {
			System.out.println("Fila cheia.");
		} else {		
			if (this.inicio == -1) {
				this.inicio = 0;
			}
			this.musicas[++this.fim] = musica;
			++this.posicaoFila;
		}
	}
	
	// Remove música.
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Fila Vazia.");
		} else {
			this.inicio++;
			this.posicaoFila--;
		}
		
	}
	
	// Consuta música.
	public String search(String nome) {
		if (!isEmpty()) {
			for (int i = this.inicio; i < this.musicas.length; i++) {
				if (this.musicas[i].equals(nome)) {
					return "Encontrado: " + this.musicas[i];
				}
			}
		}
		
		return null;
	}
	
	// Sair
	public void clean() {
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
		this.musicas = null;
	}
	
	public boolean isFull() {
		return this.posicaoFila == this.musicas.length-1;
	}
	
	public boolean isEmpty() {
		return this.posicaoFila == 0;
	}
	
	public int size() {
		return this.posicaoFila;
	}

}
