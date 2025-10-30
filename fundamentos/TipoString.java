package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// funcionalidades diretas da string
		System.out.println("Ola mundo" .charAt(0));
		String s = "Boa tarde";
		/*
		 * isso nao modifica o valor, pois str é um objeto imutavel
		 * Nesse caso, apenas esta substituindo o valor original.
		 */
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		// True pois começa com "Boa"
		System.out.println(s.startsWith("Boa"));
		// True pois comeca com boa, e como transforma em minusculo com lowercase
		System.out.println(s.toLowerCase().startsWith("boa")); // True
		System.out.println(s.endsWith("dia!")); // fase
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));//false pois comparaçao é diferente
		System.out.println(s.equalsIgnoreCase("boa tarde")); // true pois ignora maiusculo
		var nome = "joca";
		var sobrenome = "menegotto";
		var idade = 13;
		var salario = 213313.312;
		// isso resolve o problema de concatenar coisas de main
		/*
		 * %s -> string
		 * %d -> int
		 * %f -> float
		 */
		System.out.printf("O senhor %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
		// mesma coisa do print acima
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
