package controle;

import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		
		var num = 63;
		Scanner entrada = new Scanner(System.in);
		
		int tentativa = 0;
		System.out.println("Voce tem 10 tentativas! ;D");
		while (tentativa < 10) {
			
			System.out.println("\n\nchute: ");
			
			int t1= entrada.nextInt();
			
			if (t1 != num) {
				tentativa += 1;
				System.out.printf("\nvoce tem %d tentativas\n", 10 - tentativa);
				if (t1 > num) {
					System.out.printf("O numero: (%d) é maior que"
							+ " o numero que voce quer acertar; ", t1);
				}else {
					System.out.printf("O numero: (%d) é menor que"
							+ " o numero que voce quer acertar; ", t1);
				}
				
				switch(tentativa) {
				case 10:
					System.out.println("Acabou as chances! :/");
					break;
				}
				
			}else {
				System.out.println("\nParabens voce acertou!, o numero correto é: " + num);
			}
			
			entrada.close();
		}
			
		
	}
	
	
}
