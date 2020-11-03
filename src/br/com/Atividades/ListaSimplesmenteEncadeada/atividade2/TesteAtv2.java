package br.com.Atividades.ListaSimplesmenteEncadeada.atividade2;

public class TesteAtv2 {

    public static void main(String[] args) {
        /**
         * Atividade 2.
         */

         ListaEncadeada listaAlunos = new ListaEncadeada();
         listaAlunos.adiciona(new Aluno(1000,"Lucas"));
         listaAlunos.adiciona(new Aluno(1010,"Jon"));
         listaAlunos.adiciona(new Aluno(1020,"Marcos"));

         System.out.println("\nBusca do elemento: ");
         System.out.println(listaAlunos.buscaElemento(new Aluno(1000,"Lucas")).getAluno().toString());

         System.out.println("\nLista Elementos: ");
         listaAlunos.listaElementos();

         listaAlunos.remove(new Aluno(1010,"Jon"));


    }
}
