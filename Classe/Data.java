package Classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 01;
		//ano = 1970;
		this(1,1,1970);
	}
	
	Data(int days, int month, int year){
		dia = days;
		mes = month;
		ano = year;
			
	}
	
	String obterDataFormt() {
		
		String datas = dia + "/" + mes + "/" + ano;
		System.out.println(datas);
		return datas;  
		
	}
	
	
}
