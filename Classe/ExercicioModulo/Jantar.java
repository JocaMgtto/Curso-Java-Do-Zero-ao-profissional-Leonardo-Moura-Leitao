package Classe.ExercicioModulo;

public class Jantar {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Felipe", 60);
		Pessoa pessoa2 = new Pessoa("Ana", 50);
	
		Comida comida = new Comida("Brigadeiro", 1);
		Comida comida2 = new Comida("Arroz e feijao", 1.5);
		
		
		pessoa.comer(comida);
		pessoa2.comer(comida2);
		
		
		
		
		
	}
	
}
