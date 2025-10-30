package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		
		do {
			
			System.out.println("fale a palavra certa! ");
			System.out.println("Se quiser sair, escreva (exit)");
			valor = entrada.nextLine();
			
		} while(!valor.equalsIgnoreCase("exit"));

		entrada.close();
	}	
}
