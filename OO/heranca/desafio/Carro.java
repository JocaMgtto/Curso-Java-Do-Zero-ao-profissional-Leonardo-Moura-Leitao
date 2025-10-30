package OO.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidade = 0;
	int delta = 10;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	
	String acelerar() {
		if(velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
			return "Velocidade maxima atingida..";
		}else { velocidade += 10; return "\nCarro acelerando..."; }
	}
	
	String frear() {
		if(velocidade == 0) {return "\nCarro parado..";}
		else if(velocidade < delta) {
			velocidade = 0;
			return "\nCarro desacelerando... Carro parou! ";
		}
		else {
			velocidade -= delta;
			return "\nCarro desacelerando...";
		}
	}	
}
