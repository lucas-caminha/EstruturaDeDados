package br.com.Atividades.prova.Questao03;

public class Arvore {

    private NoArvore raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(int numero){
        if (numero % 2 == 0){
            System.out.println("O programa só aceita números impares.");
        } else {
            NoArvore nova = new NoArvore();
            nova.setNumero(numero);
            nova.setDireita(null);
            nova.setEsquerda(null);

            if (raiz == null){
                raiz = nova;
            } else {
                NoArvore atual = raiz;
                NoArvore anterior;
                while (true){
                    anterior = atual;
                    if (numero <= atual.getNumero()){
                        atual = atual.getEsquerda();
                        if (atual == null){
                            anterior.setEsquerda(nova);
                            return;
                        }
                    } else {
                        atual = atual.getDireita();
                        if (atual == null){
                            anterior.setDireita(nova);
                            return;
                        }
                    }
                }
            }
        }
    }

    public void exibePosOrdem(){
        System.out.print("Exibindo em pos-ordem: ");
        posOrdem(raiz);
    }

    public void posOrdem(NoArvore atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.print(atual.getNumero() + " ");
        }
    }
}
