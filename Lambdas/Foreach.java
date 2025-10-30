package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "lia", "Gui");
		
		//forma normal
		System.out.println("Forma comum..");
		for(String nome: aprovados) { System.out.println(nome); }
		
		//usando funçoes funcionais
		System.out.println("\nForma funcional #01...");
		aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		
		
		//passagem de metodo por referencia
		System.out.println("\nMethod Reference...#01");
		aprovados.forEach(System.out::println);
		
		//funcional #02
		// caso seja necessario fazer operacoes ao invez de so percorrer a lista.
		// pode ser feito tb da primeira forma, porem assim fica mais limpo e "bonito"
		System.out.println("\nForma funcional #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		//passagem de metodo por referencia
		// usando a minha funcao.
		System.out.println("\nMethod Reference...#2");
		aprovados.forEach(Foreach::meuImprimir);
		
		
		
	}
	
	

	static public void meuImprimir(String nome){
		System.out.println("Oi! Meu nome é " + nome);
	}
}
