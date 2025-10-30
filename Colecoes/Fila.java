package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("ana"); // caso fila estiver cheia devolve um erro.
		fila.offer("ana"); // caso a fila estiver cheia retorna false.
		fila.add("Joao");
		fila.add("Carlos");
		fila.add("Pedro");
		fila.offer("Joca");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());//retorna o primeiro elemento da fila, n remove
		System.out.println(fila.element());
		System.out.println(fila.poll()); // null caso fila vazia
		System.out.println(fila.remove()); // lança excessao caso fila vazia
		// element faz a mesma coisa que o peek, porem se a fila esta vazia
		// o peek retorna null, ja o element lança uma excessao.
		
		System.out.println(fila.size()); //tamanho da fila
		
		fila.clear();// limpa a fila
		System.out.println(fila.isEmpty()); // verifica se esta vazia (boolean)
		
		
		
	}
	
}
