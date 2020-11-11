package br.com.Atividades.Pilha.atividade5;

/*
 * Projete uma estrutura de pilha para guardar passo a passo de como efetuar
 * uma determinada tarefa.
 * a) Escreva a função criar a pilha
 * b) Adicione tarefas na pilha
 * c) Remova tarefas da pilha
 * d) Indique se a tarefa for concluída quando a pilha estiver vazia.
 */

public class Pilha {
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.inicializaPilha(5);
		
		pilha.adicionaTarefa("Ir até a janela");
		pilha.adicionaTarefa("Abrir janela");
		pilha.adicionaTarefa("Respirar");
		pilha.adicionaTarefa("Olhar o tempo");
		pilha.adicionaTarefa("começar o dia");
		
		pilha.removeTarefa();
		pilha.removeTarefa();
		pilha.removeTarefa();
		pilha.removeTarefa();
		pilha.removeTarefa();
		pilha.removeTarefa();
		
	}
	
	
	
	private String[] passoApasso;
	private int posicaoPilha;
	
	public Pilha() {
	}
	
	public void inicializaPilha(int quantidadePassos) {
		this.posicaoPilha = -1;
		this.passoApasso = new String[quantidadePassos];
	}

	public void adicionaTarefa(String tarefa) {
		if (this.posicaoPilha < this.passoApasso.length - 1) {
			this.passoApasso[++this.posicaoPilha] = tarefa;
		}
	}
	
	public void removeTarefa() {
		if (tarefaConcluida()) {
			System.out.println("Lista Concluida.");
		} else {
			this.posicaoPilha--;
		}
	}
	
	public boolean tarefaConcluida() {
		return this.posicaoPilha == -1;
	}
	
	
}
