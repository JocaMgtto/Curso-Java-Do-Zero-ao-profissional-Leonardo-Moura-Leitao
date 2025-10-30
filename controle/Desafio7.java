package controle;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		var num = 1;
		int valor = 0;
		
		
		while(num >= 0 ) {
			System.out.println("\nEscreva um numero: ");
			num = entrada.nextInt();
			if (num < 0 ) {
				System.out.println("Programa encerrado! ");
				System.out.println("O valor final foi: " + valor);
				break;
			}else {
			valor += num;
			System.out.println("\nA soma dos valores inseridos ate agora é " + valor);
			}
		}
		
		
		entrada.close();
	}
	
}
