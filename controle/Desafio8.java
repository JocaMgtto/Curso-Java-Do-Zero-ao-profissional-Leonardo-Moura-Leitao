package controle;

import java.util.Scanner;

public class Desafio8 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		int i = 0;
		
		while(i < 10) {
			
			System.out.println("Digite um valor: ");
			int v1 = entrada.nextInt();
			if (v1 > valor) {
				valor = v1;
				i+=1;
			}else {
				
				i+=1;
			 }
			
		}
		System.out.println("O maior valor foi: " + valor);
		
		entrada.close();
		
	}
	
	
}
