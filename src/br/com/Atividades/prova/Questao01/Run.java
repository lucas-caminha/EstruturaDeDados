package br.com.Atividades.prova.Questao01;

import java.util.Scanner;

/**
 * 01 - Dada uma fila simplesmente encadeada F e uma pilha encadeada P,
 * construa um programa para ler uma série de nome dos professores e a área do professor
 * E- Exatas , H- Humanas, de acordo com os critérios:- Se o professor for de Humanas,
 * inseri-lo na fila;- Se o professor for de Exatas, inseri-lo na pilha;- O usuário poderá:
 * F – Listar a fila P – Listar a Pilha S – Sair do programa *
 */
public class Run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FilaSimplesmenteEncadeada F = new FilaSimplesmenteEncadeada();
        PilhaEncadeada P = new PilhaEncadeada();


        int opcao;
        do {
            System.out.println("Gerenciamento de Professores.");
            System.out.println("Selecione uma opção.");
            System.out.println("1. Cadastrar Professores.");
            System.out.println("2. Listar a fila.");
            System.out.println("3. Lista a pilha.");
            System.out.println("4. SAIR.");
            opcao = scanner.nextInt();


            switch (opcao){
                case 1:
                    System.out.println("Quantos professores deseja adicionar?");
                    int quantidade = scanner.nextInt();

                    for (int i = 0; i < quantidade; i++){

                        System.out.println("Insira os dados do professor nº "+ (i+1));
                        System.out.println("Nome: ");
                        String nome = scanner.next();
                        System.out.println("Area de atuação. (E) EXATAS | (H) HUMANAS: ");
                        String area = scanner.next();

                        while (!area.equals("E") && !area.equals("H")){
                            System.out.println("Area incorreta, insira novamente.");
                            area = scanner.next();
                        }

                        if (area.equals("E")){
                            P.empilha(nome, Professor.AreaAtuacao.EXATAS);
                        } else if (area.equals("H")) {
                            F.enfileira(nome, Professor.AreaAtuacao.HUMANAS);
                        }

                    }
                    break;

                case 2:
                    System.out.println("Lista de professores de Humanas:");
                    F.exibeFila();
                    break;

                case 3:
                    System.out.println("Lista de professores de Exatas:");
                    P.exibe();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        } while (opcao != 4);





    }
}
