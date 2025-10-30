package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTesteDois {

	public static void main(String[] args) {
		
		// NAO: int -> Double
		// double -> Double
		
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
		
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (x,y) -> x * y;
		System.out.println(calculo.apply(2.0, 3.0));
	}

}
