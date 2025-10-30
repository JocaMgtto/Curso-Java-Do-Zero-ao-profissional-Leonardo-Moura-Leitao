package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (f - 32) * 5/9 = C
		final double ajuste = 32; // ajuste da formula
		final double multi = 5.0/9.0; // fator multiplicativo
		double f = 86; // variaveis
		double c = (f - ajuste) * multi;
		
		System.out.println("temperatura atual é: "  + f + "F"); 
		System.out.println("O resultado em Celcius é: " + c); 
		
		f = 64;
		c = (f - ajuste) * multi;
		

		System.out.println("Houve mudança de temperatura, hoje esta: " + f + "F"); 
		System.out.println("O resultado em Celcius é: " + c); 

		
		
	}
	
}
