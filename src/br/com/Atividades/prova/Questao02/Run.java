package br.com.Atividades.prova.Questao02;

/**
 * 02- Implemente um programa que contemple uma fila de contatos para realiza��o
 * de uma entrevista;�As op��es do programa devem ser:
 * � Inserir Entrevistado: Deve solicitar ao usu�rio os dados e incluir o contato na fila;
 * � Pr�ximo Entrevistado: Dever� pegar o candidato do In�cio da Fila, remov�-lo
 * � Sair. *
 */

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Entrevista entrevista = new Entrevista();
        System.out.println("Entrevista de Emprego.");

        int opcao;
        do{
            System.out.println("Escolha uma op��o: ");
            System.out.println("1 - Inserir Entrevistado.");
            System.out.println("2 - Pr�ximo Entrevistado.");
            System.out.println("3 - SAIR.");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do entrevistado: ");
                    String nome = scanner.next();
                    System.out.println("Informe o telefone do entrevistado: ");
                    String telefone = scanner.next();
                    Contato contato = new Contato(nome,telefone);
                    entrevista.inserirEntrevistado(contato);
                    break;

                case 2:
                    System.out.print("Pr�ximo Entrevistado: ");
                    System.out.println(entrevista.proximoEntrevistado());
                    break;

                default:
                    System.exit(0);
            }

        } while (opcao != 3);


    }
}
