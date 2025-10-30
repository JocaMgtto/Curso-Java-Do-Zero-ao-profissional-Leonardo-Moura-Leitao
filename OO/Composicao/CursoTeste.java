package OO.Composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joca");
		Aluno aluno2 = new Aluno("pedro");
		Aluno aluno3 = new Aluno("carla");
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("HTML");
		Curso curso3 = new Curso("PHP");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
	
		curso3.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno1);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso 1");
			System.out.println(aluno.nome); 
			
		}
		System.out.println(aluno1.cursos.get(2).alunos);
		System.out.println();
		
		Curso cursoEncontrado = aluno1.buscarCusrsoNome("Java");
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado);
			System.out.println(cursoEncontrado.alunos);
			
		}
		
		
		
	}
	
}
