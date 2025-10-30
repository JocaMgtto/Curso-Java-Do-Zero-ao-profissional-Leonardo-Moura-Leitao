package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	
	
	
	public double ValorCliente(){
		
		double total = 0;
		for(Compra carrinho : compras) { total +=carrinho.ObterValorTotal(); }
		return total;
	}
	
	
	Cliente(String nome){
		this.nome = nome;
		
	}
}
