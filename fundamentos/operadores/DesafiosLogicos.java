package fundamentos.operadores;

import java.util.Scanner;

public class DesafiosLogicos {
	public static void main(String[] args) {
		// trabalho terca (v ou f)
		//trabalho quinta feira (v ou f)
		Scanner leitura = new Scanner (System.in);
		System.out.println("o trabalho de terca deu certo ? ");
		String resposta1 = leitura.nextLine();
		System.out.println("o trabalho de quinta deu certo ? ");
		String resposta2 = leitura.nextLine();
		leitura.close();
		
		if (resposta1.equalsIgnoreCase("sim") && resposta2.equalsIgnoreCase("sim")){
			System.out.println("a familia vai tomar sovete e comprar a tv de 50 polegadas");}
		
		else {
			if (resposta1.equalsIgnoreCase("sim") && resposta2.equalsIgnoreCase("nao")) {
					System.out.println("vao comprar tv de 32 polegadas e tomar sorvete ");
			}
			else {
				if (resposta1.equalsIgnoreCase("nao") && resposta2.equalsIgnoreCase("sim")) {
					System.out.println("comprar tv de 32 polegadas e tomar sorvete");
				}
				else
					System.out.println("nao compra nada e nem toma sorvete");
			} 
				
		}
	}
}
		
		
		
		


