package OO.Polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(97.4);
		Arroz ingrediente1 = new Arroz(0.25);
		Feijao ingrediente2 = new Feijao(0.34);
		Arroz ingrediente3 = new Arroz(0.25);
		Arroz ingrediente4 = new Arroz(0.25);
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());
		System.out.println(ingrediente3); 
		System.out.println(ingrediente4); 
		
	}
	
}
