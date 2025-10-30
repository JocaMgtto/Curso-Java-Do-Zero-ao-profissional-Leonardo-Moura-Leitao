package Classe;

public class DataTeste {
	
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		System.out.println(data1);
		
		data1.dia = 11;
		data1.mes = 12; 
		data1.ano = 2025;
		data1.obterDataFormt();
	
		Data data2 = new Data();
		
		data2.dia = 10;	
		data2.mes = 10;
		data2.ano = 2025;
		data2.obterDataFormt();		 
		System.out.printf("O meu aniversário é na data: %d/%d/%d. O da minha namorada"
				+ " é: %d/%d/%d.%n", data1.dia, data1.mes, data1.ano, data2.dia, data2.mes, data2.ano);	
		
		
		Data data3 = new Data(12,06,1980);
		data3.obterDataFormt();	
		
		System.out.println();
		
		Data data4 = new Data();
		data4.obterDataFormt();
		
			
	
	
	}
	
	
	
}
