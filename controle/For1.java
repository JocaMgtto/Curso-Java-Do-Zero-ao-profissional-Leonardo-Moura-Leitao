package controle;

public class For1 {

	public static void main(String[] args) {
		
		for (int contador = 0; contador <= 20; contador +=2) {
			
			System.out.printf("os numero pares sao: %d%n", contador);
			
		}
		
		
		// tambem funciona
		// mas faz mais sentido usar a estrutura do for original
		int x = 2;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
			
		} 
		
		
		
	}
	
}
