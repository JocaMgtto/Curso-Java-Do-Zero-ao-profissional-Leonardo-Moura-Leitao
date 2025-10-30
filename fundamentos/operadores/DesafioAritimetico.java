package fundamentos.operadores;

public class DesafioAritimetico {
	public static void main(String[] args) {
		//fracao 1
		int valor1quad =  (int) Math.pow((6 * (3 + 2)), 2);
		int result1 = valor1quad / (3 * 2);
		System.out.println(result1);
		
		// fracao 2
		
		int valor2 = (int) Math.pow(((1-5) * (2-7))/ 2, 2);
		System.out.println(valor2);
		
		//parte de cima
		
		int cima = (int) Math.pow((result1 - valor2), 3);
		 
		// parte de baixo
		
		int result2 = cima / (int) Math.pow(10, 3);
		System.out.println(result2);
		
		
		
	}
}
