package Excecao.PersonalizadaB.copy;

@SuppressWarnings("serial")
public class NumeroForaIntervaloExcep extends RuntimeException{
	
	private String nomeAtributo;
	
	NumeroForaIntervaloExcep(String nomeAtributo){
		this.nomeAtributo = nomeAtributo;
	}
	
	public String getMensage() {
		return String.format("O atributo %s esta fora do intervalo", nomeAtributo);
	}
}
