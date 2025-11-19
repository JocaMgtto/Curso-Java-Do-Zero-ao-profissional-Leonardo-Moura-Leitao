package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {

	
	public static void main(String[] args) {
		
		List<Integer> valor = Arrays.asList(1,2,3,4);
		
		BinaryOperator<Integer> soma = (acc, x) -> acc + x;
		
		System.out.println(valor.stream()
				.reduce((acc, x) -> acc + x));
		
		System.out.println("Usando get...");
		
		int total = valor.stream()
		.reduce((acc, x) -> acc + x).get();
		
		Integer total2 = valor.parallelStream().reduce(100, soma);
		System.out.println(total2);
		System.out.println(total);
	}
}
