package br.com.Atividades.Pilha.atividade1;

/*
 * Crie um programa em java para gerenciar uma playlist da sua festa em
   casa de final de ano. Organize as m�sicas que dever�o ser todas na ordem e
   insiram em uma fila.
		a) Inserir musica
		b) Consultar m�sica
		c) Remover m�sica
		d) Sair.
 */

public class PlayList {
	
	private Musica[] musicas;
	private int posicaoPilha;
	
	// Cria��o da PlayList
	public PlayList(int tamanhoDaPlayList) {
		this.posicaoPilha = -1;
		this.musicas = new Musica[tamanhoDaPlayList];
	}
	
	// Inserir m�sica
	public void insere(Musica musica) {
		if (this.posicaoPilha < musicas.length-1) {
			this.musicas[++posicaoPilha] = musica;
		} else {
			System.out.println("PlayList Cheia.");
		}
	}
	
	// Consultar m�sica
	public Musica consulta(String nomeMusica) {
		
		if (estaVazia()) {
			System.out.println("Lista est� vazia.");
			return null;
		} else {
		
			for(int i = 0; i < posicaoPilha+1; i++) {
				
				if (musicas[i].getNome().equalsIgnoreCase(nomeMusica)) {
					System.out.println("Musica encontrada.");
					System.out.println(musicas[i].toString());
					return musicas[i];
				}
				
			}
		}
		
		System.out.println("Musica '" + nomeMusica +"' n�o encontrada.");
		return null;
		
	}
	
	// Remover m�sica
	public void remove() {
		if (estaVazia()) {
			System.out.println("PlayList Vazia.");
		} else {
			posicaoPilha--;
		}
	}
	
	public void sair() {
		posicaoPilha = -1;
	}
	
	// Verifica se est� vazia.
	public boolean estaVazia() {
		return posicaoPilha == -1;
	}
	
	// Tamanho da playlist;
	public int tamanhoDaPlayList() {
		if (estaVazia()) {
			return 0;
		}
		return this.posicaoPilha + 1;
	}
	

}
