package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberta");
		usuarios.put(1, "Ricardo");//put tanto adiciona quanto substitui.
		usuarios.put(2, "Bianca");
		usuarios.put(3, "Joca");
		usuarios.put(4, "Pedro");
		
		System.out.println(usuarios);
		System.out.println("vazio? "+usuarios.isEmpty());
		System.out.println("tamanho: "+usuarios.size());
		System.out.println("chave 2 é: "+usuarios.get(2));
		System.out.println(usuarios.keySet()); // retorna apenas chaves do map
		System.out.println(usuarios.values()); // retorna apenas os valores do map
		System.out.println(usuarios.entrySet()); //retorna chave e valor junto no map
		System.out.println(usuarios.containsKey(3)); // verifica se a chave esta no map
		System.out.println(usuarios.containsValue("Bianca")); 
		// verifica se o valor
		// esta no map.
		System.out.println(usuarios.entrySet().toString().substring(0, 4)); 
		
		//imprimir chave
		for(int chave : usuarios.keySet()) {
			
			System.out.println(chave);
		}
		
		//imprimir valor
		for(String value : usuarios.values()) {
			
			System.out.println(value);
		}
		
		// imprimir chave valor
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + "-->");
			System.out.println(registro.getValue());
		}
		
	}
	
}
