package OO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	Cliente cliente;
	List<Item> lista_item = new ArrayList<>();
	
	public double ObterValorTotal() {
		
		double total = 0;
		for(Item itens : lista_item) {
			total += itens.produto.preco * itens.quantidade;
		}
		return total;
	}
	
	public void AdicionaItem(Produto produto, int quantidade) {
		this.lista_item.add(new Item(produto, quantidade));
	}
	
	
	
	
	
	
	
	
	
	
}
