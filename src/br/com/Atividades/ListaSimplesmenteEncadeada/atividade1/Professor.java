package br.com.Atividades.ListaSimplesmenteEncadeada.atividade1;

public class Professor {

	private String nome;

	public Professor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Professor{" + "nome='" + nome + '\'' + '}';
	}
}
