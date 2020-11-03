package br.com.Atividades.ListaCircular.atividade1;

public class Run {
	public static void main(String[] args) {

		ListaCircular lista = new ListaCircular();

		lista.adiciona(new Pessoa("Lucas", 21));
		lista.adiciona(new Pessoa("Marcio", 25));
		lista.adiciona(new Pessoa("Jonas", 41));
		lista.adiciona(new Pessoa("José", 26));


		lista.exibeLista();
		System.out.println("---------------------------------------");
		lista.removeNoFim();
		lista.exibeLista();
	}

}
