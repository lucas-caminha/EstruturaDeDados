package br.com.Atividades.Pilha.atividade4;


/*
 * 4. Projete uma estrutura do tipo pilha para guardar informações de páginas da
 * web visitadas.
 * a) Escreva a função inicializarPilha
 * b) Escreva a função push para adicionar um elemento à pilha.
 * c) Escreva a função pop para remover
 */
public class Pilha {
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		pilha.inicializarPilha();
		
		pilha.push("https://www.google.com");
		pilha.push("https://www.facebook.com");
		pilha.push("https://www.orkut.com");
		pilha.push("https://www.instagram.com");
		
		pilha.pop();
		System.out.println(pilha.size());

		
	}
	
	
	
	private String[] paginasVisitadas;
	private int posicaoPilha;
	
	public Pilha() {
	}
	
	
	public void inicializarPilha() {
		this.posicaoPilha = -1;
		this.paginasVisitadas = new String[100];
	}
	
	public void push(String enderecoPagina) {
		if (this.posicaoPilha < this.paginasVisitadas.length -1) {
			this.paginasVisitadas[++this.posicaoPilha] = enderecoPagina;
		} else {
			System.out.println("Pilha cheia.");
		}
	}
	
	public String pop() {
		if (this.posicaoPilha == -1) {
			System.out.println("Pilha vazia.");
			return null;
		} else {
			return this.paginasVisitadas[this.posicaoPilha--];
		}
	}
	
	public int size() {
		return this.posicaoPilha+1;
	}
	

}
