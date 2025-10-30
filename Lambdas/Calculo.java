package Lambdas;

@FunctionalInterface  //bloqueia criar mais "funcoes" (metodos).
public interface Calculo {

	public double executar(double a, double b);
	
	default String legal() {
		return "legal";
	}
}
