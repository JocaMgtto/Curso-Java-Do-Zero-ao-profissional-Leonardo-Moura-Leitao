package Colecoes;

//import java.awt.List;
import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
	
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario usuario1 = new Usuario("Ana");
		lista.add(usuario1);

		lista.add(new Usuario("Joca"));
		lista.add(new Usuario("Rhadyja"));
		lista.add(new Usuario("Rhaula"));
		
		System.out.println(lista.get(2));
		
		System.out.println("obj removido >>>>> "+ lista.remove(1));
		System.out.println("removido ana com sucesso: "+lista.remove(new Usuario("Ana")));
		System.out.println();
		System.out.println("tem elemento? " +lista.contains(new Usuario("Rhadyja")));
		System.out.println();
		for(Usuario u : lista) {System.out.println(u);}
		
	
		
		
		
		
	}
	
}
