package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class DesafioFilter {

	
	public static void main(String[] args) {
		
		List<String> nomes = Arrays
		.asList("pedro", "Joao", "Gabi", "Rhadyja", "Maria", "carlos", "Rafa");
		
		Predicate<String> comecaR = 
				x -> x
				.toLowerCase()
				.startsWith("r");
				
		Predicate<String> iguala = 
				x -> x.toLowerCase().equalsIgnoreCase("rhadyja");
			
		Consumer<String> print = System.out::println;
		
		nomes.stream()
		.filter(comecaR)
		.filter(iguala)
		.map(x -> "Minha namorada é " + x)
		.forEach(print);
	} 
	
}
