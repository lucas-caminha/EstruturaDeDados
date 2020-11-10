package br.com.Atividades.Pilha.atividade2;

/*
 * 
 * Escreva um programa que utiliza um objeto Pilha para determinar se uma
 * string é um Palíndromo (isto é, a string é escrita identicamente de trás para
 * frente). O programa deve ignorar espaços e pontuação.
 * 
 */

public class Pilha {
	
	//private char[] ignore = {'-', ' ', '.', ','};
	private char[] palavra;
	private int posicaoPilha;
	
	// Construtor
	public Pilha(String palavraInserida) {
		this.palavra = new char[palavraInserida.length()]; 
		
		for(int i = 0; i < palavraInserida.length(); i++) {
			this.palavra[i] = palavraInserida.charAt(i);
		}
		
		this.posicaoPilha = palavraInserida.length() - 1;
	}
	
	// Verifica se a palavra é um Palíndromo.
	public boolean palindromo() {
		
		int percorrer = this.palavra.length;
		int iguais = 0;
		
		System.out.println("Verificando Palíndromo...");
		
		for(int i = 0; i < this.palavra.length; i++) {	
			
			System.out.print(this.palavra[i] + " ");
			if (this.palavra[i] == this.palavra[--percorrer]) {
				iguais++;
			}		
									 
		}
		
		return iguais == this.palavra.length;
	}
	

	public static void main(String[] args) {
		
		
		Pilha pilha = new Pilha("aibofobia");
		System.out.println("\n" + pilha.palindromo());

		
	}
	
	

}
