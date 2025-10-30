package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);			
		System.out.println("qual o numero de notas para informar ?");
		int tamanho = entrada.nextInt();
		
		double [] notasAluno = new double [tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite a nota: ");
			double valor = entrada.nextDouble();
			notasAluno[i] = valor;
		}
		
		double total = 0;
		
		for(double notas : notasAluno) {total += notas;}
		
		double resultado = total / notasAluno.length;
		System.out.println("Variavel total: " + total);
		System.out.println("Variavel resultado: " + resultado);
		System.out.println(Arrays.toString(notasAluno));
		entrada.close();
		
	}
	
}
