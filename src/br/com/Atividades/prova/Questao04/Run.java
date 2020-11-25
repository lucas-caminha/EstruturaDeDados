package br.com.Atividades.prova.Questao04;

import java.util.Scanner;

/**
 * 04 - Crie um programa que gerencie uma PILHA de SERVI�OS a serem cumpridos.
 * os servi�os s�o strings que descrevem uma a��o a ser executada. O usu�rio dever� ter duas op��es:
 * a) Inserir o servi�o na pilha;
 * b) Obter o pr�ximo servi�o da pilha. *
 */

public class Run {
    public static void main(String[] args) {

        Servicos servicos = new Servicos();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("Gerenciamento de Servi�os.");
            System.out.println("Escolha uma op��o: ");
            System.out.println("1 - Inserir servi�o.");
            System.out.println("2 - Pr�ximo Servi�o.");
            System.out.println("3 - Sair.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o servi�o: ");
                    String servico = scanner.next();
                    servicos.inserirServico(servico);
                    break;

                case 2:
                    System.out.println("Pr�ximo servi�o: " + servicos.proximoServico());
                    break;

                default:
                    System.exit(0);
            }
        } while (opcao != 3);


    }
}
