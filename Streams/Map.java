package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		
		List<String> marcas = Arrays.asList("Honda ", "Audi ", "Mercedes");
		
		marcas.stream().map((x -> x.toUpperCase())).forEach(print);
		
		UnaryOperator<String> maiuscula = x -> x.toUpperCase();
		UnaryOperator<String> primeiraLetra = x -> x.charAt(0) + "";
		UnaryOperator<String> grito = x -> x + "!!!";
		
		System.out.println("\nUsando Composicao...");
		
		marcas.stream()
		.map(maiuscula)
		.map(primeiraLetra)
		.map(grito).forEach(print);
		
		// passagem de referencia por metodo
		
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);
	} 
	
}
