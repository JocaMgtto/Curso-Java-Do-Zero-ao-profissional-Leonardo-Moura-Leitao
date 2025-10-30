package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		System.out.println("Bom");
		System.out.println("dia!");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("\n \nNome: %s \nsobrenome: %s \nidade: %d", nome, sobrenome, idade);
		entrada.close();
	}
}
