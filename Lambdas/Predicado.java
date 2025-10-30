package Lambdas;

import java.util.function.Predicate;

public class Predicado {

	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		Produto produto = new Produto("Bola", 1000.0, 0.30);
		System.out.println(isCaro.test(produto));
		
	}
	
}
