package controle;

import java.util.Scanner;

public class IfElseIf {
	
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite a nota: ");
	String valor = entrada.nextLine().replace(",", ".");
	double nota = Double.parseDouble(valor);
	
	if (nota >= 9.0) {
		System.out.println("Parabéns, classificaçao (A)! ");
	} else {
		
		if (nota < 9.0 && nota >= 7.0) {
			System.out.println("parabens, classificaçao (B)! ");
		}
		else {
			if (nota < 7.0 && nota >= 5.0) {
				System.out.println("Classificaçao (C)! ");
			} 
			else {
				if (nota < 5.0 && nota >= 3.0){
					System.out.println("Classificacao (D)");
				}
				else {
					System.out.println("Classificaçao (E)");
				}
			}
			
		}
		
	}
	
	
	entrada.close();
	
		
	}
}
