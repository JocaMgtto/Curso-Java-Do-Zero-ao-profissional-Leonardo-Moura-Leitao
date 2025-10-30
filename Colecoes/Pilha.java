package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("Pequeno principe");
		livros.add("meditações");
		livros.add("Epicteto");
		livros.add("One Piece");
		livros.push("Fada do Dente");
		
		System.out.println(livros);
		System.out.println(livros.peek());
		System.out.println(livros.poll()); //remove e retorna elemento removido
		System.out.println(livros.peek()); // mostra o topo
		System.out.println(livros);
		
		System.out.println(livros.isEmpty());  // verifica se pilha esta vazia
		
	}
	
}
