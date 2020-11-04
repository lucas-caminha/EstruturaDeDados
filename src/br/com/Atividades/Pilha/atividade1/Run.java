package br.com.Atividades.Pilha.atividade1;

public class Run {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.push("Ford");
		p.push("Fiat");
		p.push("Ferrari");
		p.push("Fusca");
		
		System.out.println(p.size());
		System.out.println(p.stacktop());
		p.pop();
		System.out.println(p.size());
		System.out.println(p.stacktop());
	}
}
