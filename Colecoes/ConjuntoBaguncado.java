package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add(1); // int -> Int
		conjunto.add('x'); // char -> Char
		conjunto.add("Teste");
		
		System.out.println("=============IMPRIMINDO=============");		
		for(var obj : conjunto) {
			System.out.println(obj);
		}
		System.out.println("=============CONJUNTO IMPRESSO=============");	
		
		System.out.println();
		
		
		System.out.println("tamanho é: " + conjunto.size());
		
		System.out.println("teste adicionado...");conjunto.add("teste");
		
		System.out.println("Tamanho é: " + conjunto.size());
		System.out.println("'teste' removendo... "+conjunto.remove("teste"));
		System.out.println("'bola' removendo... "+conjunto.remove("bola"));
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println("A palavra Teste esta no conjunto? " +conjunto.contains("Teste"));
		System.out.println("A palavra bola esta no conjunto? " + conjunto.contains("bola"));
		System.out.println();
		System.out.println();
		System.out.println();
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		System.out.println("unindo conjuntos...");
	
		conjunto.addAll(nums);
		System.out.println(conjunto);
		System.out.println();
		
		conjunto.retainAll(nums);
		System.out.println("intercessoes em comum...");
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println("limpando conjunto...");
		System.out.println(conjunto);
	}
	
}
