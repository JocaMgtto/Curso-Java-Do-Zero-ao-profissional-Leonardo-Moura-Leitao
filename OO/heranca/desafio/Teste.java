package OO.heranca.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Golf golf = new Golf();
		Civic civic = new Civic();

	
		
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		golf.acelerar();
		
	
	
	
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("civic -> "+civic.velocidade); 
		System.out.println("golf -> "+golf.velocidade);
		golf.frear();
		golf.frear();
		golf.frear();
		golf.frear();

		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		Golf golf2 = new Golf(110); //passando a velocidade maxima
		
		golf2.acelerar();
		golf2.acelerar();
		System.out.println(golf2.velocidadeAr());
		
		System.out.println("golf -> "+golf2.velocidade);

		System.out.println("civic -> "+civic.velocidade); 
		System.out.println("golf -> "+golf.velocidade);
	}
	
}
