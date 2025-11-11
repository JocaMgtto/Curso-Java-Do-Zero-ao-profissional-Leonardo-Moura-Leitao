package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStreams {

	
	public static void main(String[] args) {
		// passar referencia para metodo de forma funcional
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		// Usando Stream diretamente (usando stream of diretamente)
		Stream<String> langs = Stream.of("Java ", "Python ", "C++ ", "Rust \n" );
		langs.forEach(print);
		
		// Usando um Array (passando um array no stream of)
		String[] maisLangs = {"Python", "go", "lisp\n"};
		Stream.of(maisLangs).forEach(print);
		
		// usando o proprio array e passando ele inteiro pra stream
		Arrays.stream(maisLangs).forEach(print);
		
		//dizendo o subconjunto dos arryas
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		//forma de criar pelas colections
		List<String> outrasLangs = Arrays.asList("C", "PHP", "Python", "Java\n");
		outrasLangs.stream().forEach(print);
		
		//exibe a stream fora de ordem
		outrasLangs.parallelStream().forEach(print);
		
		//gerar Stream de forma infinita
		
//		Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n +1).forEach(println);;
		
		
		
	}
}
