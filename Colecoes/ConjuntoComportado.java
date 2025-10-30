package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>(); //Set<String> lista = 
													// new HashSet<>()
													// tambem é valido
		lista.add("bola");
		lista.add("Carro");
		lista.add("Caminhao");
		System.out.println(lista);
		
		System.out.println();
		
		int i =0;
		for(String obj : lista) {System.out.printf("%s: %s%n", i++, obj);}
		// garante ordem de incerssao
		SortedSet<String> listaOrdenada = new TreeSet<>();
		listaOrdenada.add("bola");
		listaOrdenada.add("Carro");
		listaOrdenada.add("Caminhao");
		System.out.println();
		System.out.println("Lista ordenada por TreeSet...");
		System.out.println();
		System.out.println(listaOrdenada);
		System.out.println();
		int j = 0;
		for(String obj : listaOrdenada) {System.out.printf("%s: %s%n", j++, obj);}

		System.out.println();
		
		
		
	}
	
}
