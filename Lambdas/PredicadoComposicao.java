package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	
	public static void main(String[] args) {
		// operaçoes ternarias;
		Integer numero = 3;
		String result = numero % 2 == 0 ? "Par" : "impar";
		System.out.println(result);
		System.out.println();
		
		Predicate<Integer> isPar = num -> num % 2 == 0; // true or false
		Predicate<Integer> isTresDigitos = num -> num >=100 && num <= 999;
		System.out.println(isPar.and(isTresDigitos).test(22)); // testando funcoes
		System.out.println(isPar.and(isTresDigitos).test(224)); // usando and
		System.out.println(isPar.or(isTresDigitos).test(224)); // usando or
		System.out.println(isPar.negate().and(isTresDigitos).test(224)); // usando negate
		
		
		
		
	}
	
}
