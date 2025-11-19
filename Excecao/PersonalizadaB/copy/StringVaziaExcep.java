package Excecao.PersonalizadaB.copy;

@SuppressWarnings("serial")
public class StringVaziaExcep extends Exception {

	
		
		private String nomeAtributo;
		
		StringVaziaExcep(String nomeAtributo){
			this.nomeAtributo = nomeAtributo;
		}
		
		public String getMensage() {
			return String.format("O atributo %s esta vazio", nomeAtributo);
		}
	
}
