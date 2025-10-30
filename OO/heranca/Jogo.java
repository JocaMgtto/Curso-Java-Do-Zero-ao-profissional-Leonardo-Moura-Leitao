package OO.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 10);
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.NORTE);
		
		
		Monstro monstro = new Monstro();
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.NORTE);
		monstro.setX(10);
		monstro.sety(11); 
		
		System.out.println(heroi.getVida());
		System.out.println(monstro.getVida());
		heroi.atacar(monstro);
		System.out.println(monstro.getVida());
		monstro.atacar(heroi);
		System.out.println(heroi.getVida());
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		System.out.println("vida do monstro --> " + monstro.getVida());
		System.out.println("vida do Heroi --> " +heroi.getVida());
	
	}
	
}
