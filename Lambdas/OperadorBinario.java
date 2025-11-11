package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1,n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 6 ? "Aprovado" : "Reprovado"; 
		};
		
		Function<Double, String> result = n -> n >= 6 ? "Apovado" : "Reprovado";
		
		System.out.println(media.andThen(result).apply(6.6, 6.6));
		System.out.println(resultado.apply(9.7, 4.1));
	}
}
