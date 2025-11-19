package Excecao.PersonalizadaB.copy;

import java.lang.invoke.StringConcatException;

import Excecao.Aluno;
public class Validar {

	private Validar() {}	
	
	public static void usuario(Aluno aluno) 
			throws StringVaziaExcep, StringConcatException{
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
