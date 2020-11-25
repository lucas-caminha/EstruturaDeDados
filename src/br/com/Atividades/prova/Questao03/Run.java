package br.com.Atividades.prova.Questao03;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Arvore arvore = new Arvore();

        int opcao;
        do {
            System.out.println("\nEscolha uma op��o: ");
            System.out.println("1 - Inserir n�mero.");
            System.out.println("2 - Exibir p�s ordem.");
            System.out.println("3 - SAIR.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite um n�mero");
                    int numero = scanner.nextInt();
                    arvore.inserir(numero);
                    break;

                case 2:
                    System.out.println("Exibindo em p�s ordem...");
                    arvore.exibePosOrdem();
                    break;

                case 3:
                    System.exit(0);
            }
        } while (opcao != 3);





    }

}
