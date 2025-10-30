package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
		
	}
	
	public Curso buscarCusrsoNome(String nome) {
		for (Curso procura : cursos) {
			if(procura.nome.equals(nome)) {
				return procura;
			}
		}
		return null;
		
	}
	
	public String toString() {
		return nome;
	}
	
}
