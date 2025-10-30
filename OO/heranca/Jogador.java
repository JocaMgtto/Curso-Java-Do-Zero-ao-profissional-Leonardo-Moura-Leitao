package OO.heranca;

public class Jogador {

	private int x;
	private int y;
	private int vida = 100;
	
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	
	public void sety(int y){
		this.y = y;
	}
	
	public int getVida(){
		return this.vida;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getya(){
		return this.y;
	}
	boolean atacar(Jogador oponente) {
		
		int deltaX= Math.abs(x - oponente.x);
		int deltaY= Math.abs(y - oponente.y);
		
		if (deltaX ==0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY ==0) {
			oponente.vida -= 10;
			return true;
		}else {return false;}
	}
	
	boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {y++;}
		else if(direcao == Direcao.SUL){y--;}
		else if(direcao == Direcao.LESTE) {x++;}
		else x--;
		return true;
	}
	
}
