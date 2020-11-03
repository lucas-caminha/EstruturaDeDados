package br.com.Atividades.ListaSimplesmenteEncadeada.atividade1;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	public Celula getPrimeiro() {
		return primeiro;
	}

	// Adicionar.
	public void adicionar(Professor professor) {

		Celula celula = new Celula(professor);

		if (this.isVazia()) {
			// Se a Lista está vazia, o primeiro e o ultimo serão igual ao nó inserido.
			this.primeiro = celula;
			this.ultimo = celula;
			// Se não, o próximo do ultimo será igual ao nó e o ultimo será igual ao
			// nó.
		} else {
			this.ultimo.setProximo(celula);
			this.ultimo = celula;
		}

	}

	// Remover passando nome.
	public String remover(Professor professor) {

		Celula celula = new Celula(professor);
		Celula percorrer = this.primeiro;

		if (this.isVazia()) {
			return "Lista Vazia.";
		} else {
			while (percorrer != null) {
				if (celula.getValor().getNome().equals(percorrer.getValor().getNome())) {

					String msg = "Encontrado e Removido: " + percorrer.getValor().toString();

					if (percorrer == this.primeiro && percorrer == this.ultimo) {
						limpaLista();
					} else if (percorrer == this.primeiro) {
						this.primeiro = percorrer.getProximo();
					} else if (percorrer == this.ultimo) {
						percorrer = buscaPenultimoElemento(this.primeiro);
						percorrer.setProximo(null);
						this.ultimo = percorrer;
					} else {
						this.posicaoAtual = buscaElementoAnterior(professor);
						this.posicaoAtual.setProximo(this.posicaoAtual.getProximo().getProximo());
					}

					return msg;
				}
				percorrer = percorrer.getProximo();
			}
		}
		return "Não encontrado.";
	}

	// Remover o ultimo.
	public void removerUltimo() {

		if (!this.isVazia()) {
			Celula celula = buscaPenultimoElemento(this.primeiro);
			this.ultimo = celula;
			celula.setProximo(null);
		} else {
			this.primeiro = this.ultimo = null;
		}

	}

	// Verificar tamanho.
	public int tamanhoDaLista() {

		int tamanho = 0;
		Celula percorrer = primeiro;

		if (isVazia()) {
			return 0;
		} else {
			while (percorrer != null) {
				tamanho++;
				percorrer = percorrer.getProximo();
			}

			return tamanho;
		}

	}

	// Verifica se está vazia.
	public boolean isVazia() {
		if (this.primeiro == null && this.ultimo == null) {
			return true;
		} else {
			return false;
		}
	}

	// Apagar lista, deletando todos os registros.
	public void limpaLista() {

		int tamanho = 0;

		try {
			while (primeiro != null) {
				removerUltimo();
				tamanho++;
			}
		} catch (NullPointerException exception) {
			primeiro = ultimo = null;
			tamanho++;
			System.out.println("A Lista foi esvaziada e {" + tamanho + "} Elementos foram eliminados.");
		}

	}

	// Listar os registros da lista.
	public void listar() {
		Celula celula = primeiro;

		if (this.isVazia()) {
			System.out.println("Lista está vazia.");
		} else {
			while (celula != null) {
				System.out.println(celula.getValor().toString());
				celula = celula.getProximo();
			}
		}

	}

	public Celula buscaElementoAnterior(Professor professor) {

		Celula celula = new Celula(professor);
		Celula percorrer = this.primeiro;

		if (isVazia()) {
			return null;
		} else {

			while (percorrer != null) {

				if (celula.getValor().getNome().equals(percorrer.getProximo().getValor().getNome())) {
					return percorrer;
				}

				percorrer = percorrer.getProximo();
			}

			return null;
		}

	}

	private Celula buscaPenultimoElemento(Celula celula) {
		if (celula.getProximo().equals(this.ultimo)) {
			return celula;
		}
		return this.buscaPenultimoElemento(celula.getProximo());
	}

	public Celula buscaRecursiva(Celula percorrer, String nome) {

		if (percorrer == null) {
			return null;
		}

		if (nome.equals(percorrer.getValor().getNome())) {
			return percorrer;
		} else {
			return buscaRecursiva(percorrer.getProximo(), nome);
		}

	}

}
