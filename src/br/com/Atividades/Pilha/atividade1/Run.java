package br.com.Atividades.Pilha.atividade1;

public class Run {

	public static void main(String[] args) {

		Musica musica = new Musica("Maluco Beleza", "Raul Seixas");
		Musica musica1 = new Musica("Ainda é Cedo", "Renato Russo");
		Musica musica2 = new Musica("No Cap", "Derek");
		
		PlayList play = new PlayList(10);
		
		System.out.println(play.tamanhoDaPlayList());
		
		play.insere(musica);
		play.insere(musica1);
		play.insere(musica2);
		
		System.out.println(play.tamanhoDaPlayList());
		
		play.consulta("No Cap");
		
		play.remove();
		
		System.out.println(play.tamanhoDaPlayList());
		
		play.sair();
		
		System.out.println(play.tamanhoDaPlayList());
		
		
		

	}

}
