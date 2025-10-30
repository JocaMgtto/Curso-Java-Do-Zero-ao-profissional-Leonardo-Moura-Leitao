package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		double [] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
	
		
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			System.out.println("Escreva um valor: ");
			double valor = entrada.nextDouble();
			notasAlunoA[i] = valor;
			
			total += notasAlunoA[i];
			
		}
		System.out.println(total);
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		entrada.close();
		
	}
	

	
}
