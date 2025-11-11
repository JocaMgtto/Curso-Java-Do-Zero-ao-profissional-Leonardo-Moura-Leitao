package Lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar"; 
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + " Sera que estou acima da media?";
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.andThen(duvida)
				.apply(32);
		
		
		
		System.out.println(resultadoFinal);
		
	}
	
}
