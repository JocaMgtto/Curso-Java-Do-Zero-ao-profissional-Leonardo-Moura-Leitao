package Classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		
		usuario.nome = "Pedro Silve";
		usuario.email = "PedroSilva@hotmaiol.com";
		
		Usuario usuario2 = new Usuario();
		
		usuario2.nome = "Pedro Silve";
		usuario2.email = "PedroSilva@hotmaiol.com";
		System.out.println(usuario == usuario2);
		System.out.println(usuario.equals(usuario2)); 
		
		
	}
	  
}
