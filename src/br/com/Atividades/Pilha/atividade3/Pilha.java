package br.com.Atividades.Pilha.atividade3;

/*
 * Crie um programa que gerencie uma PILHA de TAREFAS a serem
 * cumpridas. As tarefas são strings que descrevem uma ação a ser executada. O
 * usuário deverá ter duas opções:
 * a) Inserir tarefa na pilha;
 * b) Obter a próxima tarefa da pilha.
 */

public class Pilha {
	
	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		pilha.push("Lavar carro");
		pilha.push("Alimentar cachorro");
		pilha.push("ir trabalhar");
		pilha.push("jogar lixo fora");
		
		System.out.println(pilha.proximaTarefa("ir trabalhar"));
		
	}
	
	
	private String[] tarefas;
	private int posicaoPilha;
	
	public Pilha() {
		this.posicaoPilha = -1;
		this.tarefas = new String[10];
	}

	
	public void push(String tarefa) {
		if (this.posicaoPilha < this.tarefas.length - 1) {
			this.tarefas[++posicaoPilha] = tarefa;
		}
	}
	
	public String proximaTarefa(String tarefa) {
		
		for(int i = 0; i < this.posicaoPilha; i++) {
			if (tarefas[i].equals(tarefa)) {
				return this.tarefas[i+1];
			}
		}
		return "Não encontrado ou sem proxima atividade.";
	}

	
	public String pop() {
		if (isEmpty()) {
			System.out.println("Lista vazia.");
			return null;
		} else {
			return this.tarefas[this.posicaoPilha--];
		}
	}
	
	public boolean isEmpty() {
		return posicaoPilha == -1;
	}

	

		
	
	
	
}
