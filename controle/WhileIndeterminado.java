package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		
		while (!palavra.equalsIgnoreCase("Sair")) {
			
			System.out.println("Digite qualquer coisa: ");
			palavra = entrada.nextLine();
		
		}
		entrada.close();
		
	}
	
}
