package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double notas = 0.0;
		double medias = 0.0;
		int validas = 0;
		
		while (notas != - 1.0) {
			System.out.println("Digite a nota (ou -1 para sair): ");
			notas = entrada.nextInt();
			System.out.println("\n");
			if (notas >= 0.0 && notas <= 10.0) {
				validas += 1;
				medias =  notas / validas;
				System.out.println("notas validas foram: " + validas);
				System.out.println("A média é " + medias);}
			
		}
		entrada.close();
		
		
		
		
	}

}
