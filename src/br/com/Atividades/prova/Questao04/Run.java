package br.com.Atividades.prova.Questao04;

import java.util.Scanner;

/**
 * 04 - Crie um programa que gerencie uma PILHA de SERVIÇOS a serem cumpridos.
 * os serviços são strings que descrevem uma ação a ser executada. O usuário deverá ter duas opções:
 * a) Inserir o serviço na pilha;
 * b) Obter o próximo serviço da pilha. *
 */

public class Run {
    public static void main(String[] args) {

        Servicos servicos = new Servicos();

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("Gerenciamento de Serviços.");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir serviço.");
            System.out.println("2 - Próximo Serviço.");
            System.out.println("3 - Sair.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o serviço: ");
                    String servico = scanner.next();
                    servicos.inserirServico(servico);
                    break;

                case 2:
                    System.out.println("Próximo serviço: " + servicos.proximoServico());
                    break;

                default:
                    System.exit(0);
            }
        } while (opcao != 3);


    }
}
