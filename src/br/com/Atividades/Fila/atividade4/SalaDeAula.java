package br.com.Atividades.Fila.atividade4;

/*
  	4- Crie um programa em java para gerenciar a fila de uma sala de aula,
	onde deverá está ordenada por idade
	a) Inserir alunos
	b) Consultar alunos
	c) Sair.
 * 
 */

public class SalaDeAula {
	
	public static void main(String[] args) {
		
		SalaDeAula sala = new SalaDeAula();
		sala.insereAluno("Lucas", 42);
		sala.insereAluno("Gabriel", 107);
		sala.insereAluno("Marco", 51);
		sala.insereAluno("Ric", 17);
		
		sala.consultaAlunos();
		System.out.println();
		
		sala.organizaPorIdade();
		
		sala.consultaAlunos();
	
		
	}
	
	
	private Aluno[] sala;
	private int inicio, fim, posicaoFila;
		
	public SalaDeAula() {
		this.sala = new Aluno[20];
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
	}
	
	// Inserir Aluno.
	public void insereAluno(String nome, int idade) {
		if (!(this.posicaoFila == this.sala.length -1)) {
			if (this.inicio == -1) {
				this.inicio = 0;
			}
			this.sala[++this.fim] = new Aluno(nome, idade);
			this.posicaoFila++;
		}
	}

	// Consultar Alunos.
	public void consultaAlunos() {
		
		for (int i = this.inicio; i < this.posicaoFila; i++) {
			System.out.println(sala[i].toString());
		}
		
	}
	
	private void organizaPorIdade() {
		
		Aluno aux;
	
		for (int i = this.inicio; i < this.posicaoFila; i++) {
			for (int j = this.inicio; j < this.posicaoFila; j++) {
				if (this.sala[i].getIdade() < this.sala[j].getIdade()) {
					aux = this.sala[i];
					this.sala[i] = this.sala[j];
					this.sala[j] = aux;
				}
			}	
		}

	}
	
	public void sair() {
		this.sala = null;
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
	}

	public class Aluno {
		
		private String nome;
		private int idade;
		
		public Aluno(String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		@Override
		public String toString() {

			return "{Nome: " + getNome() + " | Idade: " + getIdade() + "}";
		}
		
		
	}

}
