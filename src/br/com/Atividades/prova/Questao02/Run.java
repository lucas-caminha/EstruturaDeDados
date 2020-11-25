package br.com.Atividades.prova.Questao02;

/**
 * 02- Implemente um programa que contemple uma fila de contatos para realização
 * de uma entrevista;–As opções do programa devem ser:
 * • Inserir Entrevistado: Deve solicitar ao usuário os dados e incluir o contato na fila;
 * • Próximo Entrevistado: Deverá pegar o candidato do Início da Fila, removê-lo
 * • Sair. *
 */

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Entrevista entrevista = new Entrevista();
        System.out.println("Entrevista de Emprego.");

        int opcao;
        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Inserir Entrevistado.");
            System.out.println("2 - Próximo Entrevistado.");
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
                    System.out.print("Próximo Entrevistado: ");
                    System.out.println(entrevista.proximoEntrevistado());
                    break;

                default:
                    System.exit(0);
            }

        } while (opcao != 3);


    }
}
