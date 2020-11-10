package br.com.Atividades.Pilha.atividade1;

/*
 * Crie um programa em java para gerenciar uma playlist da sua festa em
   casa de final de ano. Organize as músicas que deverão ser todas na ordem e
   insiram em uma fila.
		a) Inserir musica
		b) Consultar música
		c) Remover música
		d) Sair.
 */

public class PlayList {
	
	private Musica[] musicas;
	private int posicaoPilha;
	
	// Criação da PlayList
	public PlayList(int tamanhoDaPlayList) {
		this.posicaoPilha = -1;
		this.musicas = new Musica[tamanhoDaPlayList];
	}
	
	// Inserir música
	public void insere(Musica musica) {
		if (this.posicaoPilha < musicas.length-1) {
			this.musicas[++posicaoPilha] = musica;
		} else {
			System.out.println("PlayList Cheia.");
		}
	}
	
	// Consultar música
	public Musica consulta(String nomeMusica) {
		
		if (estaVazia()) {
			System.out.println("Lista está vazia.");
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
		
		System.out.println("Musica '" + nomeMusica +"' não encontrada.");
		return null;
		
	}
	
	// Remover música
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
	
	// Verifica se está vazia.
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
