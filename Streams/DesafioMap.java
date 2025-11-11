package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Consumer<Integer> print = System.out::println;
		/*
		 * Numero para string binaria 6 => "110"
		 * reverter a string  "110" => "011"
		 * converter de volta para inteiro "011" => 3 
		 */
		
		UnaryOperator<String> reverte = 
				x -> new StringBuilder(x)
				.reverse()
				.toString();
				
			
		 
		
		nums.stream().map(
			x -> Integer.toBinaryString(x))
			.map(reverte)
			.map(x -> Integer.parseInt(x, 2)).forEach(print);;
			
			
//		// pode ser feito assim:
//			
//		System.out.println();
//		nums.stream()
//		.map(Integer::toBinaryString)
//		.map(reverte)
//		.forEach(System.out::println);
		
		
	}
	
}
