package br.com.Atividades.Pilha.atividade1;

public class Musica {
	
	private String nome;
	private String cantor;
	
	public Musica(String nome, String cantor) {
		super();
		this.nome = nome;
		this.cantor = cantor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCantor() {
		return cantor;
	}
	public void setCantor(String cantor) {
		this.cantor = cantor;
	}

	@Override
	public String toString() {
		return "Musica [nome=" + nome + ", cantor=" + cantor + "]";
	}
	

}
