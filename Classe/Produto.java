package Classe;

public class Produto {

	String nome;
	double preco;
	static final double desconto = 0.25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	
	Produto(){
		
		
	}
	
	double PrecoComDesconto() {
		double PrecoCalculado = preco - (desconto * preco);
		System.out.printf("Valor final: %.2f%n", PrecoCalculado);
		return PrecoCalculado;
		
	}
	
}
