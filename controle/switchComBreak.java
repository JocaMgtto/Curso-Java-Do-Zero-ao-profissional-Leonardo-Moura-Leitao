package controle;

import java.util.Scanner;

public class switchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
						
		String conceito = "";
		System.out.println("Insira uma Nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 6,7,8,9,10:
			conceito = "A";
			break;
			
		case 3,4,5:
			conceito = "C";
			break;
			
		case 0,1,2:
			conceito = "E";
			break;
		default:
			conceito = "nao encontrado! ";
		}
		
		System.out.println("o conceito da nota é: " + conceito);
		entrada.close();
		 
	}
	
}
