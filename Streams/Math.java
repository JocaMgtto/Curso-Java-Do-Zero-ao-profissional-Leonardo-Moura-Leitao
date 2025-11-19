package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Math {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gabi", 6.3);
		Aluno a3 = new Aluno("Carla", 8.0);
		Aluno a4 = new Aluno("Paulo", 6.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 6;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		//retorna um verdadeiro ou falso para o predicado acima
		System.out.println(alunos.stream().allMatch(aprovado));
		// or, retrona true se algum for do predicado acima for true
		System.out.println(alunos.stream().anyMatch(aprovado));
		// retorna se nenhum satisfaz o predicado (true pra 
		//nenhum satisfazer, false para se alguem satisfazer)
		// 'ninguem foi aprovado ? -> false '
		System.out.println(alunos.stream().noneMatch(aprovado));
		// 'ninguem foi reprovado ? -> true '
		System.out.println(alunos.stream().noneMatch(reprovado));
	}
	
}
