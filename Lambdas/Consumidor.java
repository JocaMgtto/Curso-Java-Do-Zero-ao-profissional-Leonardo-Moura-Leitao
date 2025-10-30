package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!");
		Produto p1 = new Produto("Celular Xiaomi", 123.0, 0.50);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2000.0, 0.50);
		Produto p3 = new Produto("caneta", 10.0, 0.50);
		Produto p4 = new Produto("Estojo", 25.0, 0.50);
		Produto p5 = new Produto("cadeira", 35.0, 0.50);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach((p) -> {System.out.println(p.nome + ", Preco: " + p.preco);});
		System.out.println("\n");
		produtos.forEach(System.out::println);
		
	
	
	}
	
}
