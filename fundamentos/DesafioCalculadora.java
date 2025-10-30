package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// ler numero
		// ler numero2
		// + - * / %
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite uma oprecao: ");
		String op = leitura.nextLine();
		
		System.out.println("digite um valor: ");
		double valor1 = leitura.nextDouble();
		
		System.out.println("digite um valor: ");
		double valor2 = leitura.nextDouble();
		
		Double result1 = op.equalsIgnoreCase("+")? valor1 + valor2 : 0.0;
		result1 = op.equalsIgnoreCase("-")? valor1 - valor2 : result1;
		result1 = op.equalsIgnoreCase("*")? valor1 * valor2 : result1;
		result1 = op.equalsIgnoreCase("/")? valor1 / valor2 : result1;
		System.out.println(result1);
		
		leitura.close();		

	}
}
