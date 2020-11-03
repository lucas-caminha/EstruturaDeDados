package br.com.Atividades.ListaDuplamenteEncadeada.atividade3;


public class Run {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.adiciona("Julieta", 20);
        lista.adiciona("Carlos", 30);
        lista.adiciona("Lucas", 21);
        lista.adiciona("Marcos", 40);
        lista.adiciona("Vanessa", 52);

        lista.adicionaNoInicio("Gabriel", 26);
        lista.adicionaNoFim("Dedé", 32);

        lista.exibeLista();




    }

}
