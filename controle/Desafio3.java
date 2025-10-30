package controle;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a Nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Insira a Nota 2: ");
		double nota2 = entrada.nextDouble();
		
		double mediaF = (nota1 + nota2) / 2;
		
		if (mediaF >= 7.0) {
			System.out.println("Aprovado! ");
		}else if(mediaF >= 4.0 && mediaF < 7.0){
			System.out.println("Recuperaçao! ");
		}else {
			System.out.println("Reprovado! ");
		}
		entrada.close();
	}
	
}
