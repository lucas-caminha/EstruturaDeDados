package br.com.Atividades.Fila.atividade2;

/*
 *
 	2- Implemente um programa que contemple uma fila de contatos para um
	callcenter. As op��es do programa devem ser:
	a) Inserir Contato: Deve solicitar ao usu�rio os dados e incluir o contato na fila;
	b) Pr�ximo Contato: Dever� pegar o Contato do In�cio da Fila, remov�-lo e
	mostrar os seus dados na tela para o usu�rio efetuar o contato com o
	cliente.
	c) Sair.
 */

public class CallCenter {
	
	public static void main(String[] args) {
		
		CallCenter cl = new CallCenter();
		cl.insereContato("Lucas");
		cl.insereContato("Gabriel");		
		cl.insereContato("Marco");	
		cl.insereContato("Fer");
		
		System.out.println(cl.proximoContato());
		System.out.println(cl.proximoContato());
		System.out.println(cl.proximoContato());

		cl.sair();
		
	}
	
	private String[] contatos;
	private int inicio, fim, posicaoFila;
	
	public CallCenter() {
		this.contatos = new String[10];
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
	}
	
	// Inserir Contato.
	public void insereContato(String contato) {
		if (!isFull()) {
			if (this.inicio == -1) {
				this.inicio = 0 ;
			}
			
			this.contatos[++this.fim] = contato;
			this.posicaoFila++;
			
		} else {
			System.out.println("Lista cheia.");
		}
	}
	
	// Pr�ximo Contato.
	public String proximoContato() {
		if (!isEmpty()) {
			String contatoRemovido = this.contatos[this.inicio];
			this.inicio++;
			this.posicaoFila--;
			return "Contato: " + contatoRemovido;
		} else {
			return "Lista vazia.";
		}
	}
	
	// Sair.
	public void sair() {
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
		this.contatos = null;
	}

	
	public boolean isFull() {
		return this.posicaoFila == this.contatos.length - 1;
	}
	
	public boolean isEmpty() {
		return this.posicaoFila == 0;
	}
	
	
}
