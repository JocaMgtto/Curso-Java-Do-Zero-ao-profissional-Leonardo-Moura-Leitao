package Excecao.PersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExcep extends RuntimeException {

	
		
		private String nomeAtributo;
		
		StringVaziaExcep(String nomeAtributo){
			this.nomeAtributo = nomeAtributo;
		}
		
		public String getMensage() {
			return String.format("O atributo %s esta vazio", nomeAtributo);
		}
	
}
