package br.com.Atividades.Fila.atividade1;

public class Run {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.enqueue(100);
		fila.enqueue(150);
		fila.enqueue(200);
		fila.enqueue(250);
		
		System.out.println(fila.size());
		fila.show();
		fila.dequeue();
		System.out.println(fila.size());
		fila.show();
	}
}
