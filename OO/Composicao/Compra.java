package OO.Composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void adicionaItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void addItem(String nome, int quantidade, double preco) {
		adicionaItem(new Item(nome, quantidade, preco));
	}
	
	public double valorTotal() {
		
		double total = 0;
		for(Item valor: itens) {total += valor.quantidade * valor.preco;}
		return total;
	
	}
}
