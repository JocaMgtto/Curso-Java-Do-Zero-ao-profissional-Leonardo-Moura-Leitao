package Excecao.PersonalizadaB.copy;
import java.lang.invoke.StringConcatException;

import Excecao.Aluno;
public class TesteValidacoes {

	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -1);
			
			Validar.usuario(aluno);
		} catch (StringVaziaExcep e) {
			System.out.println(e.getMessage());
		} catch (StringConcatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fim! ");
	}
	
}
