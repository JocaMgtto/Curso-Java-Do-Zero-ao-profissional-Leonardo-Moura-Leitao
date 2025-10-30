package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		int a = 1;
		int  b = 2;
		// operador antes, mais pressa
		//operador depois, menos pressa
		System.out.println(++a == b--);
		System.out.println(a == b);
	}
}
