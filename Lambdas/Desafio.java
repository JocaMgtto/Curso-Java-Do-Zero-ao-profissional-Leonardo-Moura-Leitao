package Lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;


public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 2342.23, 0.13);
		
		/*
		 * Calcular preco real (com desconto)
		 * imposto municipal: >= 2500 (8,5%) / < 2500 (isento)
		 * frete: >= 3000 (100) / < 3000 (50)
		 * Arredondar: duas casas decimais
		 * Formatar: R$1234,56
		 * 
		 */
		
		//preco real
		BiFunction<Double, Double, Double> desconto = (n, x) -> n - (n * x);
		//imposto
		Function<Double, Double> imposto = n -> n >= 2500 ? n -(n * 0.085) : n * 1;
		//frete
		Function<Double, Double> frete = n -> n >= 3000 ? n + 100 : n + 50;
		// Arredonda e Formata
		Function<Double, String> arredonda = n -> String.format("R$%.2f", n);  
		
		System.out.println(desconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredonda)
				.apply(p.preco, p.desconto)); 
		
	
	}
	
}
