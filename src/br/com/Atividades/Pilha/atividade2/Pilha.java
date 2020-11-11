package br.com.Atividades.Pilha.atividade2;

/*
 * Escreva um programa que utiliza um objeto Pilha para determinar se uma
 * string � um Pal�ndromo (isto �, a string � escrita identicamente de tr�s para
 * frente). O programa deve ignorar espa�os e pontua��o.
 */

public class Pilha {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();
		pilha.palindromo("ai-bo-fobia");

	}

	private char[] ignore = {'-', ' ', '.', ','};
	private char[] palavra;
	private int posicaoPilha;
	
	// Construtor
	public Pilha() {
		this.posicaoPilha = -1;
	}
	
	// Verifica se a palavra � um Pal�ndromo.
	public void palindromo(String palavra) {
		this.palavra = new char[palavra.length()];

		for (int i = 0; i < palavra.length(); i++){
			push(palavra.charAt(i));
		}

		this.palavra = removePontuacaoOuEspacos(this.palavra);

		if (verificaPalindromo(this.palavra)){
			System.out.println("A palavra " + palavra + " � um pal�ndromo.");
		} else {
			System.out.println("A palavra " + palavra + " N�O � um pal�ndromo.");
		}
	}

	private boolean verificaPalindromo(char[] palavra){

		int percorrer = posicaoPilha;
		int iguais = 0;

		for (int i = 0; i < posicaoPilha; i++){
			if (palavra[i] == palavra[percorrer--]){
				iguais++;
			}
		}
		return iguais == posicaoPilha;
	}

	public void push(char letra){
		if (this.posicaoPilha < this.palavra.length - 1){
			this.palavra[++posicaoPilha] = letra;
		}
	}

	public char pop(){
		if (isEmpty()) {
			return ' ';
		}
		return this.palavra[this.posicaoPilha--];
	}

	// Verifica se a pilha est� vazia.
	public boolean isEmpty() {
		if(this.posicaoPilha == -1) {
			return true;
		} else {
			return false;
		}
	}

	// Verifica se a pilha tem pontua��o ou espa�os
	public char[] removePontuacaoOuEspacos(char[] palavra){
		
		char[] substituto = new char[palavra.length];
		int perc = 0;

		for (int i = 0; i < palavra.length; i++){
			for (int j = 0; j < ignore.length; j++){
				
				if (palavra[i] != ignore[j]){
					substituto[perc] = palavra[i];	
				}else {
					this.posicaoPilha--;
					i++;
				}
			}
			perc++;
		}

		return substituto;
	}

}
