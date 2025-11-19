package Streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gabi", 6.3);
		Aluno a9 = new Aluno("Gabi", 6.3);
		Aluno a3 = new Aluno("Carla", 8.0);
		Aluno a10 = new Aluno("Carla", 8.0);
		Aluno a4 = new Aluno("Paulo", 6.5);
		
		Aluno a11 = new Aluno("Paulo", 6.5);
		Aluno a5 = new Aluno("ze", 10.0);
		Aluno a6 = new Aluno("pedro", 2.3);
		Aluno a7 = new Aluno("bia", 7.0);
		Aluno a8 = new Aluno("Paula", 7.5);
		
		List<Aluno> alunos 
		= Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
		
		System.out.println("Distinct.. ");
	
		alunos.stream().distinct().forEach(System.out::println);
		System.out.println("\nSkip/limit");
		
		alunos.stream()
		.skip(2) // diz quantos elementos é para pular
		.limit(2) //limita o numero de elementos que pega
		.forEach(System.out::println);
		
		System.out.println("\nTakeWhile");
		
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 6)
		.forEach(System.out::println);
	
	}
	
}
