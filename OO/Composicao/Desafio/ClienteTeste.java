package OO.Composicao.Desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Paulo");
		Produto produto1 = new Produto(200.0, "teclado mecanico");
		Compra compra1 = new Compra();
		compra1.AdicionaItem(produto1, 2);
		System.out.println(compra1.ObterValorTotal());

		System.out.println(cliente1.ValorCliente());
	}
	
}
