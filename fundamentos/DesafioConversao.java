package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o salario 1: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.println("( " + salario1 + " ), " + "digite o salario 2: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.println("( " + salario1 + ", "+ salario2+" ), " + "digite o salario 3: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		System.out.printf("Os salarios digitados sao: %s %s %s", salario1, salario2, salario3 );
		
		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);
		
		double media = (num1 + num2 + num3) / 3;
		System.out.println("\na media dos salarios é: " + media);
		entrada.close();
		
		
	}
}
