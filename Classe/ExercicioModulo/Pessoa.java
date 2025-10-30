package Classe.ExercicioModulo;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome1, double peso1){
		
		nome = nome1;
		peso = peso1;
		
	}
	
	public double comer(Comida comida) {
		if (comida != null) {
			
			System.out.println("A pessoa esta comendo!\n ");
			this.peso += comida.peso;
			System.out.printf("O peso da pessoa agora é: %.2f Kg\n", this.peso);
		}else 
			{System.out.println("Comida invalida! ");}
		return this.peso;
	}
	
}
 