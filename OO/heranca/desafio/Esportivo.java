package OO.heranca.desafio;

public interface Esportivo {
	
	 void ligarTurbo();
	 void desligarTurbo();
	 
	 
	 // basicamente uma implementacao padrao.
	 default int velocidadeAr() {
		 return 1;
	 }
	
}
