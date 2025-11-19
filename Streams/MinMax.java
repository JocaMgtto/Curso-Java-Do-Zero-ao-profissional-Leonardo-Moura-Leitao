package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gabi", 6.3);
		Aluno a3 = new Aluno("Carla", 8.0);
		Aluno a4 = new Aluno("Paulo", 6.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (y1, x2) -> {
			if (y1.nota > x2.nota) return 1;
			if(y1.nota < x2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
	}
	
}
