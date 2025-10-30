package Classe;

public class ValorVsRef {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // valor, pois tipo primitivo
		
		a++; 
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // referencia objt
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormt());
		System.out.println(d2.obterDataFormt());
		
		VoltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormt());
		System.out.println(d2.obterDataFormt());
		
	}
	
	static void VoltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 12;
		d.ano = 1232;
	}
	
}
