package Streams;

public class Media {

	private double total;
	private int quant;
	
	public Media add(double valor) {
		total += valor;
		quant ++;
		return this;
	}
	
	
	public double getValor() {
		return total / quant;
	}
	
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quant = m1.quant + m2.quant;
		return resultante;
				
	}
}
