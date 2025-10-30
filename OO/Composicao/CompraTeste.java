package OO.Composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Carlos";
		c1.addItem("Batata", 2, 20);
		c1.addItem("nozes", 1, 3.5);
		c1.addItem("ameixa", 4, 40.21);
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
		
	}
	
}
