package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;



public class ImprimindoObjetos {

	
	public static void main(String[] args) {
		
	List<String> aprovados = Arrays.asList("Ly", "lu", "la,", "gui"); 	
	
	System.out.println("Usando o foreach...");
	for(String valor : aprovados) {
		System.out.println(valor); 
	}
	System.out.println("\nUsando iterator...");
	Iterator<String> it = aprovados.iterator();
	// verifica se tem mais um elemento
	while(it.hasNext()) {
		System.out.println(it.next()); //pega o poximo elemento
	}
	
	System.out.println("\nUsando Stream...");
	
	//iteracao de forma interna
	Stream<String> st = aprovados.stream();
	st.forEach(System.out::println); // laço interno
	
	
	
	}
	
}
