package OO.heranca.desafio;

public class Civic extends Carro{

	
	Civic(){
		this(200);
	}
	
	Civic(int velocidademaxima){
		super(velocidademaxima);
	}

	String acelerar() {
		super.acelerar();
		return "Acelereando...";
	}
	
}
