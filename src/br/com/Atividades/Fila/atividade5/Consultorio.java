package br.com.Atividades.Fila.atividade5;

/*
 	5- Escreva um programa em java utilizando pilhas, que apresente as
	seguintes opções no menu:
	a) Inserir Paciente
	b) Atender paciente
	c) Verificar se há paciente
	d) Indicar o próximo paciente a ser atendido
	e) Quantidade de pacientes que aguardam atendimento
	f) Sair
 */

public class Consultorio {
	
	public static void main(String[] args) {
		
		Consultorio consultorio = new Consultorio();
		
		consultorio.inserePaciente("Lucas");	
		consultorio.inserePaciente("Gabriel");	
		consultorio.inserePaciente("Ric");	
		consultorio.inserePaciente("Chico");	
		
		System.out.println(consultorio.proximoPaciente());
		System.out.println(consultorio.aguardandoAtendimento());
		
		consultorio.atendePaciente();
		System.out.println(consultorio.proximoPaciente());
		System.out.println(consultorio.aguardandoAtendimento());
		
	}
	
	private String[] pacientes;
	private int inicio, fim, posicaoFila;
	
	public Consultorio() {
		this.pacientes = new String[20];
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
	}
	
	// Inserir paciente.
	public void inserePaciente(String paciente) {
		
		if (!(this.posicaoFila == this.pacientes.length -1)) {
			if (this.inicio == -1) {
				this.inicio = 0;
			}
			
			this.pacientes[++this.fim] = paciente;
			this.posicaoFila++;
			System.out.println("Paciente: " + paciente + " inserido.");
		}
		
	}
	
	// Atender Paciente.
	public void atendePaciente() {
		if (temPaciente()) {
			this.inicio++;
			this.posicaoFila--;
		}
	}
	
	// Verificar se há paciente.
	public boolean temPaciente() {
		if (this.posicaoFila == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	// Indicar o próximo paciente a ser atendido
	public String proximoPaciente() {
		return this.pacientes[this.inicio];
	}
	
	// Quantidade de pacientes que aguardam atendimento.
	public int aguardandoAtendimento() {
		return this.posicaoFila;
	}
	
	//  Sair
	public void sair() {
		this.pacientes = null;
		this.inicio = this.fim = -1;
		this.posicaoFila = 0;
	}

}
