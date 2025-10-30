package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media1 = 8.0;
		double media2 = 5.9;
		String resultado1 = media1 >= 7.0 ? "aprovado" : "recuperacao";
		String resultado2 = media2 >= 7.0 ? "aprovado" : "recuperacao";
		
		System.out.println(resultado1); 
		System.out.println(resultado2);
		
		double nota = 6.0;
		boolean bomComportamento = true;
		boolean passouporNota = nota >= 7.0;
		boolean temDesconto = passouporNota && bomComportamento;
		String resultado = temDesconto ? "Sim. ": "Nao. ";
		System.out.println("tem desconto? " + resultado);
		
	}
}
