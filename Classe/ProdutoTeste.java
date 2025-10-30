package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto( "Notebook", 1000.0, 0.25);
		
		System.out.println("nome p1: " + p1.nome);
		System.out.println("preco p1: " + p1.preco);
		System.out.println("desconto p1: " + Produto.desconto);
		System.out.println();
		p1.PrecoComDesconto();
		System.out.println();
				
		
		var p2 = new Produto();
		p2.nome = "Geladeira";
		p2.preco = 3000.00;
		
		
		System.out.println("nome p2: " + p2.nome);
		System.out.println("preco p2: " + p2.preco);
		System.out.println("desconto p2: " + Produto.desconto);
		System.out.println();
		p2.PrecoComDesconto();
		System.out.println();
		
		
		double precoFinal1 = p1.preco * (1 - Produto.desconto);
		double precoFinal2 = p2.preco * (1 - Produto.desconto);
		
		double mediaFinal = (precoFinal1 + precoFinal2) / 2;
		
		
		System.out.printf("media do carrinho = %.2f", mediaFinal);
		
	}
	
}
