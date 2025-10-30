package controle;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva um numero: ");
		int valor1 = entrada.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			if (valor1 == i && valor1 % 2 == 0) {
				System.out.printf("Valor %d Esta entre 0 e 10 e é par", valor1);
				break;
			}
			if (valor1 != i && valor1 % 2 == 1) {
				System.out.println("o valor nao esta entre 0 e 10 ou nao é par");
				break;	
			}
		}
		entrada.close();
	}
	
	
}
