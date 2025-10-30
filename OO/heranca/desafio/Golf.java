package OO.heranca.desafio;

public class Golf extends Carro implements Esportivo{

	
	Golf(){
		this(290);
	}
	
	Golf(int velocidademaxima){
		super(velocidademaxima);
	}
	
	
	String acelerar() {
	
		super.acelerar();
		super.acelerar();
		
		return "Acelearando..." + super.velocidade;
	}
	
	String frear() {
		super.frear();
		super.frear();
		return"Freando...";
	}
	

	public void ligarTurbo() {
		delta = 40;
		
	}
	
	public void desligarTurbo() {
		delta = 20;
		
	}
	
}
