package Colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Paulo"));
		usuarios.add(new Usuario("Alex"));
		boolean resultado = usuarios.contains(new Usuario("Alex"));
		System.out.println(resultado);
		
		
	}
	
}
