package Excecao.PersonalizadaA;

import Excecao.Aluno;
public class Validar {

	private Validar() {}	
	
	public static void usuario(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("o Aluno esta nulo");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExcep("nome");
			
		}
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloExcep("nota");
		}
	}

}
