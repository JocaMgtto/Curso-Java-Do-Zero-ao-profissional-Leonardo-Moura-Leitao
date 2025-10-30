package Classe;

public class AreaCirc {

	double raio;
	static double pi = 3.14;
	
	public AreaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
		
	}
	
	double area() {
		return Math.pow(raio, 2) * pi;
	}
}
