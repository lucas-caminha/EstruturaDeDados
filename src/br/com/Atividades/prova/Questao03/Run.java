package br.com.Atividades.prova.Questao03;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Arvore arvore = new Arvore();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Inserir número.");
            System.out.println("2 - Exibir pós ordem.");
            System.out.println("3 - SAIR.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite um número");
                    int numero = scanner.nextInt();
                    arvore.inserir(numero);
                    break;

                case 2:
                    System.out.println("Exibindo em pós ordem...");
                    arvore.exibePosOrdem();
                    break;

                case 3:
                    System.exit(0);
            }
        } while (opcao != 3);





    }

}
