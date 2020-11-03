package br.com.Atividades.ListaSimplesmenteEncadeada.atividade3;


public class TesteAtv3 {

    public static void main(String[] args) {

        /**
         * Atividade 3.
         */

        ListaEncadeada lista = new ListaEncadeada();

        int loop = 15;

        while(loop > 1){
            lista.adicionar(loop*2);
            loop--;
        }

        System.out.println(lista.buscaNumero(20));





    }
}
