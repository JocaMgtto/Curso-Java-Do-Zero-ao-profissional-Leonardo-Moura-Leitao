package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		// definir com S maiusculo
		String c;
		System.out.println("Frase original: ");
		String s = "Bom dia X";
		System.out.println(s);
		System.out.println("Frases modificadas: ");
		c = s.replace("X", "Senhora");
		c = s.toUpperCase();
		System.out.println(c + " (metodo UpperCase)");
		c = s.replace("X", "senhora");
		System.out.println(c + " (metodo replace)");
		System.out.println("\n");
		String x = "Joca" .toUpperCase();
		System.out.println(x);
		
	}
}
