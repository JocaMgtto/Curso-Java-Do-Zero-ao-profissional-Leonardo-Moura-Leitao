package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Pedro", 5.6);
		Aluno a3 = new Aluno("Carlos", 9.1);
		Aluno a4 = new Aluno("Paulo", 6.0);
		Aluno a5 = new Aluno("Joca", 10.0);
		Aluno a6 = new Aluno("Paula", 3.5);
		Aluno a7 = new Aluno("gabi", 7.5);
		
		List<Aluno> aluno = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
		
		aluno.stream()
		.filter(a -> a.nota >= 6.0)
		.map(x -> "Aprovados: " + x.nome)
		.forEach(System.out::println);
		
		System.out.println();
		
		Consumer<String> print = System.out::println;
		Predicate<Aluno> reprovado = x -> x.nota < 6.0;
		Function<Aluno, String> ImprimeAluno = 
				x -> "Reprovado " + x.nome; 
		
		aluno.stream()
		.filter(reprovado)
		.map(ImprimeAluno)
		.forEach(print);
		
		
	}

	
	
}
