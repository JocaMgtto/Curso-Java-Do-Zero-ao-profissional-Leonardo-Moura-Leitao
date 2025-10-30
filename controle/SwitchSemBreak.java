package controle;

public class SwitchSemBreak {

	
	public static void main(String[] args) {
		
		String faixa = "cinza";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Nota 10");
		case "marrom":
			System.out.println("Nota 8");
		case "azul":
			System.out.println("nota 6");
		case "verde":
			System.out.println("nota 4");		
		case "cinza":
			System.out.println("nota 2");		
		default:
			System.out.println("nota 0\n");		
		
		}
		
		int idade = 3;
		
		switch(idade){
		case 3: 
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe comer");
		case 1:
			System.out.println("Sabe falar");
		case 0:
			System.out.println("Sabe chorar");
			break;
			
			
		}
		
		
		
	}
	
}
