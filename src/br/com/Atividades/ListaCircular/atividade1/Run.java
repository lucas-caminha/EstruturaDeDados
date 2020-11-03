package br.com.Atividades.ListaCircular.atividade1;

public class Run {
	public static void main(String[] args) {
		
		ListaCircular lista = new ListaCircular();
	
		lista.adiciona(new Pessoa("Lucas", 21));
		lista.adiciona(new Pessoa("Mario", 31));
		lista.adiciona(new Pessoa("Jonas", 56));
		
		lista.exibeLista();
		System.out.println("---------------------------------------");
		lista.removeNoFim();
		lista.exibeLista();
	}

}
