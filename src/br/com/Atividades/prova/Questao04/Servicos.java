package br.com.Atividades.prova.Questao04;

public class Servicos {

    private String[] servicos;
    private int posicaopilha;

    public Servicos() {
        this.posicaopilha = -1;
        this.servicos = new String[25];
    }

    public void inserirServico(String servico){
        if (this.posicaopilha < servicos.length -1){
            this.servicos[++posicaopilha] = servico;
        } else {
            System.out.println("A lista de serviços está cheia.");
        }
    }

    public String proximoServico(){
        if (posicaopilha <= 0){
            return "Pilha de serviços vazia.";
        } else {
            return this.servicos[--posicaopilha];
        }
    }


}
