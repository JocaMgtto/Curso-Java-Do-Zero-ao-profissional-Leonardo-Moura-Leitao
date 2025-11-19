package Excecao.PersonalizadaA;
import Excecao.Aluno;
public class TesteValidacoes {

	public static void main(String[] args) {
		try {
			Aluno aluno = new Aluno("", -1);
			
			Validar.usuario(aluno);
		} catch (StringVaziaExcep e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim! ");
	}
	
}
